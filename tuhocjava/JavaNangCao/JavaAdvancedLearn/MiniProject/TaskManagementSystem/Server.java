package JavaNangCao.JavaAdvancedLearn.MiniProject.TaskManagementSystem;

import java.io.*;
import java.net.*;
import java.nio.file.*;

public class Server {
    static final int PORT = 3000;
    static final String FILE = "users.txt";

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("Server chạy tại http://localhost:" + PORT);

        while (true) {
            Socket client = server.accept();
            handleRequest(client);
        }
    }

    static void handleRequest(Socket client) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            OutputStream out = client.getOutputStream();

            String requestLine = in.readLine();
            if (requestLine == null) return;

            String[] parts = requestLine.split(" ");
            String method = parts[0];
            String path = parts[1];

            // Đọc headers để lấy Content-Length
            int contentLength = 0;
            String line;
            while (!(line = in.readLine()).isEmpty()) {
                if (line.startsWith("Content-Length:")) {
                    contentLength = Integer.parseInt(line.split(":")[1].trim());
                }
            }

            char[] body = new char[contentLength];
            in.read(body);
            String requestBody = new String(body);

            // ========================
            // ROUTING
            // ========================
            if (path.equals("/signup")) {
                String response = handleSignup(requestBody);
                sendResponse(out, response);
            }
            else if (path.equals("/signin")) {
                String response = handleSignin(requestBody);
                sendResponse(out, response);
            }
            else {
                serveStatic(out, path);
            }

            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ========================
    // SIGNUP
    // ========================
    static String handleSignup(String body) throws IOException {
        String email = extract(body, "email");
        String password = extract(body, "password");

        File file = new File(FILE);
        if (!file.exists()) file.createNewFile();

        BufferedReader reader = new BufferedReader(new FileReader(FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(email)) {
                reader.close();
                return "Email đã tồn tại";
            }
        }
        reader.close();

        FileWriter fw = new FileWriter(FILE, true);
        fw.write(email + "," + password + "\n");
        fw.close();

        return "Đăng ký thành công";
    }

    // ========================
    // SIGNIN
    // ========================
    static String handleSignin(String body) throws IOException {
        String email = extract(body, "email");
        String password = extract(body, "password");

        File file = new File(FILE);
        if (!file.exists()) return "Chưa có tài khoản";

        BufferedReader reader = new BufferedReader(new FileReader(FILE));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts[0].equals(email) && parts[1].equals(password)) {
                reader.close();
                return "Đăng nhập thành công";
            }
        }
        reader.close();

        return "Sai tài khoản hoặc mật khẩu";
    }

    // ========================
    // PARSE JSON (đơn giản)
    // ========================
    static String extract(String json, String key) {
        String search = "\"" + key + "\":\"";
        int start = json.indexOf(search) + search.length();
        int end = json.indexOf("\"", start);
        return json.substring(start, end);
    }

    // ========================
    // SERVE HTML
    // ========================
    static void serveStatic(OutputStream out, String path) throws IOException {
        if (path.equals("/")) path = "/SignIn.html";

        File file = new File("public" + path);

        if (!file.exists()) {
            sendResponse(out, "404 Not Found");
            return;
        }

        byte[] content = Files.readAllBytes(file.toPath());

        out.write(("HTTP/1.1 200 OK\r\n").getBytes());
        out.write(("Content-Type: text/html\r\n\r\n").getBytes());
        out.write(content);
    }

    // ========================
    // RESPONSE
    // ========================
    static void sendResponse(OutputStream out, String message) throws IOException {
        out.write(("HTTP/1.1 200 OK\r\n").getBytes());
        out.write(("Content-Type: text/plain\r\n\r\n").getBytes());
        out.write(message.getBytes());
    }
}

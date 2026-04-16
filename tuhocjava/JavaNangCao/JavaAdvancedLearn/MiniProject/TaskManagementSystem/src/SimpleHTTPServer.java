package JavaNangCao.JavaAdvancedLearn.MiniProject.TaskManagementSystem.src;

import com.sun.net.httpserver.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.*;
import java.util.concurrent.Executors;

public class SimpleHTTPServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Context 1: Xử lý file tĩnh (HTML, CSS, JS)
        server.createContext("/", exchange -> {
            String path = exchange.getRequestURI().getPath();
            if (path.equals("/")) path = "/index.html";
            
            File file = new File("web" + path);
            if (file.exists()) {
                String contentType = getContentType(path);
                exchange.getResponseHeaders().set("Content-Type", contentType);
                byte[] content = Files.readAllBytes(file.toPath());
                exchange.sendResponseHeaders(200, content.length);
                exchange.getResponseBody().write(content);
            } else {
                String error = "404 Not Found";
                exchange.sendResponseHeaders(404, error.length());
                exchange.getResponseBody().write(error.getBytes());
            }
            exchange.close();
        });

        // Context 2: API lấy danh sách Task (Giả lập DB bằng file JSON)
        server.createContext("/api/tasks", exchange -> {
            String json = "[{\"id\":1, \"title\":\"Học Java Core\"}, {\"id\":2, \"title\":\"Code NumPy\"}]";
            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, json.length());
            exchange.getResponseBody().write(json.getBytes());
            exchange.close();
        });

        // Đa luồng: Giúp server xử lý nhiều request cùng lúc
        server.setExecutor(Executors.newFixedThreadPool(10));
        System.out.println("🚀 Server started at: http://localhost:8080");
        server.start();
    }

    private static String getContentType(String path) {
        if (path.endsWith(".html")) return "text/html";
        if (path.endsWith(".css")) return "text/css";
        if (path.endsWith(".js")) return "application/javascript";
        return "text/plain";
    }
}

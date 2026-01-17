public class test52 {
    public static void main(String[] args) {
        String duongDan = "D:/galailaptrinh/music/remix.mp3";
        String[] s = duongDan.split("/");
        String fileName = s[s.length-1];
        System.out.println(fileName);
        String[] filePart = fileName.split("\\.");
        String file = filePart[0];
        System.out.println(file);
    }
}

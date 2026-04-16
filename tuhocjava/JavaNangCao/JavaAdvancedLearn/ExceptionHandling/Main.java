package JavaNangCao.JavaAdvancedLearn.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        FileService service = new FileService();

        try {
            service.uploadFile("C:\\Users\\Admin\\Desktop\\testvideo.mov"); // Giả sử file này rất nặng
        } catch (FileTooLargeException e) {
            System.out.println("Loi nghiep vu: " + e.getMessage());
            e.printErrorDetail();
        } catch (Exception e) {
            System.out.println("Lỗi hệ thống không xác định.");
        }
    }
}

package JavaNangCao.JavaAdvancedLearn.Annotation.ValidationEngine;

public class AdminService {
    @RequiredRole("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted!");
    }

    @RequiredRole("ADMIN")
    public void viewData() {
        System.out.println("Data displaying...");
    }
}

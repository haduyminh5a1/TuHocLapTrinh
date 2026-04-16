package JavaNangCao.JavaAdvancedLearn.Annotation.StringLengthValidation;

public class Main {
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration("abc", null, "Tôi là ai");
        
        try {
            ValidatorEngine.validate(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package JavaNangCao.JavaAdvancedLearn.StringLengthValidation;

public class UserRegistration {
    @Length(min = 5, max = 20)
    private String username;

    @Length(min = 8, max = 32)
    private String password;

    private String bio;

    public UserRegistration(String username, String password, String bio) {
        this.username = username;
        this.password = password;
        this.bio = bio;
    }

}

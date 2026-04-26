package Baitaptrenlop.PasswordVerifier;

public class PasswordVerifier {
    private String password;

    public PasswordVerifier(String password){
        this.password = password;
    }

    

    public boolean verifier(){
        if (getPassword().length() > 6 && validCheck()){
            return true;
        }
        return false;
    }

    public boolean validCheck(){
        int count = 0;
        int lowerCount = 0;
        int upperCount = 0;
        for (int i=0;i<getPassword().length();i++){
            if (Character.isDigit(getPassword().charAt(i))){
                count++;
            }
            else if (Character.isLowerCase(getPassword().charAt(i))){
                lowerCount++;
            }
            else if (Character.isUpperCase(getPassword().charAt(i))){
                upperCount++;
            }
        }
        if (count == 0) return false;
        if (lowerCount == 0) return false;
        if (upperCount == 0) return false;
        return true;
    }

    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }
}

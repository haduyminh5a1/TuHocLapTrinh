package BaiTap.BaiTuLam;
import java.io.*;
import java.util.*;

public class UserMethod {
    private String userName;
    private String password;

    //Constructors
    public UserMethod(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    //Create new account
    public void createAccount(String userName, String password) throws IOException{
        HashMap<String, String> logIn = new HashMap<>(){{
            put(userName, password);
        }};
        
    }
}

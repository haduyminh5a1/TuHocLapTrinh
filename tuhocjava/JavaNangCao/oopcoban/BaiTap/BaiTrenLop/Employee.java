package BaiTap.BaiTrenLop;

public class Employee {
    private String ename;
    private String enumber;
    private String hireDate;

    //Constructors
    public Employee(String ename, String enumber, String hireDate){
        this.ename = ename;
        this.enumber = enumber;
        this.hireDate = hireDate;
    }
    //Getters

    public String getename() {
        return ename;
    }

    public String getEnumber() {
        return enumber;
    }

    public String getHireDate() {
        return hireDate;
    }
    //Setters

    public void setename(String ename) {
        this.ename = ename;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    
}

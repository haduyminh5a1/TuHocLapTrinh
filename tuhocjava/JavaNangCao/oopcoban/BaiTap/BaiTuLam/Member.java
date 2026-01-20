package BaiTap.BaiTuLam;

public abstract class Member {
    private String name;
    private String id;
    private String info;
    public double monthlyFee = 30.00;

    //Constructors
    public Member(String name, String id, String info){
        this.name = name;
        this.id = id;
        this.info = info;
    }
    //
    public abstract double calculateMonthlyFee();
}

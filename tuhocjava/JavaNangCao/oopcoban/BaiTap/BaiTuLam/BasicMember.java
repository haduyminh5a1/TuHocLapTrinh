package BaiTap.BaiTuLam;

public class BasicMember extends Member {

    public BasicMember(String name, String id, String info) {
        super(name, id, info);
    }

    @Override
    public double calculateMonthlyFee() {
        return 30.00; //Base fee
    }
    
}

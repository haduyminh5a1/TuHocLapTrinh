package BaiTap.BaiTuLam;

public class PremiumMember extends Member{
    public PremiumMember(String name, String id, String info){
        super(name, id, info);
    }

    @Override
    public double calculateMonthlyFee(){
        return 60.00; //Pool + Sauna included
    }
}

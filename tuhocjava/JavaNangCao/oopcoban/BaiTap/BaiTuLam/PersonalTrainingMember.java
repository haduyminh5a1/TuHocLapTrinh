package BaiTap.BaiTuLam;

public class PersonalTrainingMember extends PremiumMember {
    private int session;
    private final double SESSION_FEE = 25.00;
    public PersonalTrainingMember(String name, String id, String info){
        super(name, id, info);
    }
    
    @Override
    public double calculateMonthlyFee(){
        return super.calculateMonthlyFee() + session * (SESSION_FEE);
    }
}

public class test50 {
    public static void main(String[] args) {
        String a = "toi cham hoc toi chiu kho toi dep trai";
        String[] check = a.split(" ");
        int dem=0;
        for (String check1 : check) {
            if ("toi".equals(check1)) {
                dem++;
            }
        }
        System.out.println(dem);
    }
}

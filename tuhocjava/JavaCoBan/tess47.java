public class tess47 {
    public static void main(String[] args) throws Exception {
        String s1 = "English = 78 Science = 83 Math = 68 History = 65";
        String[] tachChuoi = s1.split(" ");
        int tong = 0;
        double soHang = 0;
        for (int i=0;i<tachChuoi.length;i++){
            if (tachChuoi[i].equals("=")){
                if (i+1<tachChuoi.length){
                    try {
                    int a = Integer.parseInt(tachChuoi[i+1]);
                    soHang++;
                    tong +=a;}
                    catch (NumberFormatException ex){
                    }
                }
            } 
        }
        System.out.println(tong);
        System.out.printf("%.1f" ,tong/soHang);
    }
}

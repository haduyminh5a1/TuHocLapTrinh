public class newdemo {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(10, "Tay", "36361818");
        Student s1 = new Student("12323213", "Tu cha", 9.6);

        System.out.println(s1.toString());
        System.out.println(sv1.thongTinSinhVien());
        s1.setID("36363366363");
        System.out.println(s1.getID());
        System.out.println(s1.getID());
        System.out.println(s1.getID());
        System.out.println(s1.getID());
        System.out.println(Student.instanceCount);

        System.out.println(sv1.toString());
        System.out.println(s1.getRank());
        double n = Math.sqrt(3);
    }
}

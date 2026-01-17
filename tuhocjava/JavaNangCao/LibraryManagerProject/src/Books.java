// public class Books {
//     //Thuộc tính (Bao gồm Mã số sách, Tên sách, Tên tác giả, Số bản sao, Số bản sao hiện có trong thư viện)
//     private final String id;
//     private String tenSach;
//     private String tacGia;
//     private int soBanHienTai;
//     private int tongSoBan;
//     private boolean daChoMuon;

//     //Constructors (Gồm các bước vận hành)
//     //Thêm sách
//     public Books(String id, String tenSach, String tacGia, int tongSoBan, boolean daChoMuon) {
//         this.id = id;
//         this.tenSach = tenSach;
//         this.tacGia = tacGia;
//         this.tongSoBan = tongSoBan;
//         this.soBanHienTai = tongSoBan;
//         this.daChoMuon = false;
//         System.out.println();
//     }

//     //Phương thức
//     public boolean daChoMuon(){
//         return daChoMuon;
//     }
//     public void dangMuon(){
//         this.daChoMuon = true;
//     }
//     public void daTraLai(){
//         this.daChoMuon = false;
//     }
//     public String toFileString(){
//         return id + " | " + tenSach + " | " + tacGia + " | " + soBanHienTai + " | " + daChoMuon;
//     }

//     public String getId() {
//         return id;
//     }

//     public String getTenSach() {
//         return tenSach;
//     }

//     public String getTacGia() {
//         return tacGia;
//     }

//     public int getSoBanHienTai() {
//         return soBanHienTai;
//     }

//     public int getTongSoBan() {
//         return tongSoBan;
//     }

//     @Override
//     public String toString() {
//         return String.format("| ID: %s | Tiêu đề: %s | Tác giả: %s | Số bản: %d/%d | Tình trạng: ",id,tenSach,tacGia,soBanHienTai,tongSoBan,daChoMuon);
//     }
//     public static Books fromFileString(String line){
//         String[] p = line.split(",");
//         // Books b = new Books(p[0],p[1],p[2], Integer.parseInt(p[3]));
//         // if (Boolean.parseBoolean(p[4])){

// //         // }
//     }






// }

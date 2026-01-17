package Enum;

public enum XepLoai {
    gioi("Xếp loại giỏi"),   //0
    kha("Xếp loại khá"),    //1
    trungBinh("Xếp loại Trung Bình"),  //2
    yeu("Xếp loại Yếu"),    //3
    duoiHoc("Bị đuổi học"); //4
    private String msg;
    XepLoai(String msg){
        this.msg = msg;
    }
    public String mieuTa(){
        return this.msg;
    }
}

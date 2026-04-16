package JavaNangCao.Baitaptrenlop;

public class Area {

    public static double areaCalculate(double r){
        return Math.PI * (r * r);
    }

    public static double areaCalculate(double width, double length){
        return width * length;
    }

    public static double areaCalculate(double r, double h, boolean PI){
        return Math.PI * (r * r) * h;
    }

}

package JavaNangCao.Baitaptrenlop;

public class LandTract {
    private double length;
    private double width;

    // Constructor
    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        LandTract other = (LandTract) obj;
        return this.getArea() == other.getArea();
    }

    @Override
    public String toString() {
        return String.format("Land [Length: %.2f, Width: %.2f, Area: %.2f]", 
                             length, width, getArea());
    }
}

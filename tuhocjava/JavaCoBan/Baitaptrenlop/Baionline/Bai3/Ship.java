package JavaCoBan.Baitaptrenlop.Baionline.Bai3;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship() {
        name = "";
        yearBuilt = "";
    }

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public String toString() {
        return "Ship Name: " + name + " | Year Built: " + yearBuilt;
    }
}

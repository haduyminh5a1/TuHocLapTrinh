package JavaCoBan.Baitaptrenlop.Baionline.Bai3;

public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip() {
        super();
        maxPassengers = 0;
    }

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip Name: " + getName() + " | Maximum Passengers: " + maxPassengers;
    }
}
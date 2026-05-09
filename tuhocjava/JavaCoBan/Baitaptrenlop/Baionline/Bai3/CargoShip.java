package JavaCoBan.Baitaptrenlop.Baionline.Bai3;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {
        super();
        cargoCapacity = 0;
    }

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        return "CargoShip Name: " + getName() + " | Cargo Capacity: " + cargoCapacity + " tons";
    }
}

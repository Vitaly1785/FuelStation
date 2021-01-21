package FuelStation;

public class Vehicle {
    private double fullTank;
    private double fuelTankCap;
    private double fuelCon;
    private String title;

    public Vehicle(double fullTank, double fuelTankCap, double fuelCon, String title) {
        this.fullTank = fullTank;
        this.fuelTankCap = fuelTankCap;
        this.fuelCon = fuelCon;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFuelTankCap(double fuelTankCap) {
        this.fuelTankCap = fuelTankCap;
    }

    public double getFuelTankCap() {
        return fuelTankCap;
    }

    public double getFullTank() {
        return fullTank;
    }

    public double fuelConsumption() {
        if (fuelTankCap > fuelCon) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("remaining fuel in the tank of %s = %s", title, fuelTankCap - fuelCon));
            return fuelTankCap -= fuelCon;
        }
        System.out.println(String.format("%s is running out of fuel  ", title));
        return 0;
    }
}

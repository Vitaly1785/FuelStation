package FuelStation;

public class Movement {
    GasStation gs = new GasStation();

    public void traffic(Vehicle v) {
        try {
            do {
                System.out.println(String.format("%s rides on the highway", v.getTitle()));
                while (v.fuelConsumption() != 0) {
                    System.out.println(String.format("%s continues to move", v.getTitle()));
                }
                gs.refueling(v);
            } while (v.getFuelTankCap() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


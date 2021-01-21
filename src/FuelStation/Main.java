package FuelStation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int COUNT = 10;

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[COUNT];
        vehicles[0] = new Bus("bus1 Ikarus");
        vehicles[1] = new Car("car1 VW");
        vehicles[2] = new Truck("truck1 MAN");
        vehicles[3] = new Bus("bus2 Volvo");
        vehicles[4] = new Bus("bus3 LIaZ");
        vehicles[5] = new Car("car2 Audi");
        vehicles[6] = new Truck("truck2 Scania");
        vehicles[7] = new Truck("truck3 Kamaz");
        vehicles[8] = new Truck("truck4 Freightliner");
        vehicles[9] = new Car("car3 Lada");

        Movement movement = new Movement();
        ExecutorService es = Executors.newFixedThreadPool(COUNT);

        for (Vehicle vehicle : vehicles) {
            es.execute(()->movement.traffic(vehicle));
        }
        es.shutdown();
    }
}


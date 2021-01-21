package FuelStation;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GasStation {
    Semaphore smp = new Semaphore(3);
    Lock lock = new ReentrantLock();

    public void refueling(Vehicle v) {
        try {
            System.out.println(" " + v.getTitle() + " pulled up to the gas station");
            smp.acquire();
            System.out.println(" " + v.getTitle() + " is refueling");
            lock.lock();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            smp.release();
            lock.unlock();
            System.out.println(" " + v.getTitle() + " is refueled");
            v.setFuelTankCap(v.getFullTank());
        }
    }
}


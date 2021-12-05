package Env_Homework_02;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Bicycle("B1", 2),
                new Bicycle("B2",2),
                new Car("C1", 4),
                new Car("C2",4),
                new Truck("T1",6),
                new Truck("T2",6)
        };

        ServiceStation serviceStation = new ServiceStation();

        for (Vehicle vehicle : vehicles) {
            serviceStation.check(vehicle);
        }
    }
}
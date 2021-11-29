package Env_Homework_02;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Bicycle("Bicycle1", 2),
                new Bicycle("Bicycle2", 4),
                new Car("Car1", 4),
                new Car("Car2", 4),
                new Truck("Truck1", 6),
                new Truck("Truck2", 8)
        };

        ServiceStation serviceStation = new ServiceStation();

        for (Vehicle vehicle : vehicles) {
            serviceStation.check(vehicle);
        }
    }
}
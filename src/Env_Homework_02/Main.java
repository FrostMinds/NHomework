package Env_Homework_02;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("Bicycle1", 2);
        Bicycle bicycle1 = new Bicycle("Bicycle2", 4);

        Car car = new Car("Car1", 4);
        Car car1 = new Car("Car2", 4);

        Truck truck = new Truck("Truck1", 6);
        Truck truck1 = new Truck("Truck2", 8);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle1);
        station.check(car);
        station.check(car1);
        station.check(truck);
        station.check(truck1);
    }
}
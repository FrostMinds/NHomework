package Env_Homework_02;

public abstract class Truck extends Auto {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkVehicle() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
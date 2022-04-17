package Env_Homework_02;

public abstract class Car extends Auto {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkVehicle() {
        System.out.println("Проверяем двигатель");
    }
}
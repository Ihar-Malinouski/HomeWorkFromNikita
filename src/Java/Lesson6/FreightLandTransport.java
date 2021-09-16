package Java.Lesson6;

import java.util.Scanner;

public class FreightLandTransport extends LandTransport {
    int vehicleCarryingCapacity;
    private double amountOfCargo;

    public FreightLandTransport(int power, String brand, double weight, double maximumSpeed, int numberOfWheels, double fuelConsumption, int vehicleCarryingCapacity) {
        this.power = power;
        this.brand = brand;
        this.weight = weight;
        this.maximumSpeed = maximumSpeed;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.vehicleCarryingCapacity = vehicleCarryingCapacity;
    }

    public void descriptionOfLightLandTransport() {
        System.out.println("Марка грузового автомобиля - " + brand + "\nМощность - " + power + "л/с\nКоличество колёс - " + numberOfWheels + "м\nРасход топлива - " + fuelConsumption + "л/100км\nГрузоподъёмность - " + vehicleCarryingCapacity + "т\nМаксимальная скорость - " + maximumSpeed + "км/ч\nМасса - " + weight + "кг\nМОЩНОСТЬ В КИЛОВАТТАХ - " + valuesInKilowatts + "кВ");
    }

    @Override
    public void methodExecutionForGroundVehicles() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество груза, который хотите поместить в грузовой автомобиль: ");
        this.amountOfCargo = Double.parseDouble(in.nextLine());
        if (amountOfCargo > vehicleCarryingCapacity) {
            System.out.println("Вам нужен грузовик побольше");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } else {
            System.out.println("Грузовик загружен");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void outputOfAllMethods() {
        descriptionOfLightLandTransport();
        calculationInKilowatts();
        methodExecutionForGroundVehicles();
    }

    @Override
    public void calculationInKilowatts() {
        valuesInKilowatts = 0.74 * power;
    }
}
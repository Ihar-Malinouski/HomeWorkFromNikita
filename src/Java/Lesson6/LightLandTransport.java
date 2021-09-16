package Java.Lesson6;

import java.util.Scanner;

public class LightLandTransport extends LandTransport {
    String carBodyType;
    int numberOfPassengersInTheCar;
    private double travelTime;
    private double travelTimeAtMaximumSpeed;
    private double fuelConsumptionAtMaximumSpeed;

    public LightLandTransport(int power, String brand, double weight, double maximumSpeed, int numberOfWheels, double fuelConsumption, String carBodyType, int numberOfPassengersInTheCar) {
        this.power = power;
        this.brand = brand;
        this.weight = weight;
        this.maximumSpeed = maximumSpeed;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.carBodyType = carBodyType;
        this.numberOfPassengersInTheCar = numberOfPassengersInTheCar;
    }

    public void descriptionOfLightLandTransport() {
        System.out.println("Марка легкового автомобиля - " + brand + "\nМощность - " + power + "л/с\nКоличество колёс - " + numberOfWheels + "\nРасход топлива - " + fuelConsumption + "л/100км\nТипо кузова - " + carBodyType + "\nКоличество пассажиров - " + numberOfPassengersInTheCar + "\nМаксимальная скорость - " + maximumSpeed + "км/ч\nМасса - " + weight + "кг\nМОЩНОСТЬ В КИЛОВАТТАХ - " + valuesInKilowatts + "кВ");
    }

    @Override
    public void calculationInKilowatts() {
        valuesInKilowatts = 0.74 * power;
    }

    @Override
    public void methodExecutionForGroundVehicles() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в пути (минуты): ");
        double travelTime = Double.parseDouble(in.nextLine());
        this.travelTime = travelTime;
        travelTimeAtMaximumSpeed = ((maximumSpeed * 1000) * (travelTime / 60)) / 1000;
        fuelConsumptionAtMaximumSpeed = fuelConsumption * (travelTimeAtMaximumSpeed / 100);
        System.out.println("За время " + travelTime / 60 + "ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maximumSpeed + " км/ч проедет " + travelTimeAtMaximumSpeed + "км и израсходует " + fuelConsumptionAtMaximumSpeed + " литров топлива");
    }

    @Override
    public void outputOfAllMethods() {
        descriptionOfLightLandTransport();
        calculationInKilowatts();
        methodExecutionForGroundVehicles();
    }
}

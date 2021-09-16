package Java.Lesson6;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport {
    int numberOfPassengersOnThePlane;
    boolean businessClassOnThePlane;
    private double theNumberOfPassengersOnThePlaneForBoarding;

    public CivilAirTransport(int numberOfPassengersOnThePlane, boolean businessClassOnThePlane, int wingspan, int minimumRunwayLengthForTakeOff, int power, String brand, double weight, double maximumSpeed) {
        this.numberOfPassengersOnThePlane = numberOfPassengersOnThePlane;
        this.businessClassOnThePlane = businessClassOnThePlane;
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
        this.power = power;
        this.brand = brand;
        this.weight = weight;
        this.maximumSpeed = maximumSpeed;
    }

    public void calculationInKilowatts() {
        valuesInKilowatts = 0.74 * power;
    }

    public void descriptionOfCivilAirTransport() {
        System.out.println("Марка самолёта - " + brand + "\nМощность - " + power + "л/с\nМинимальная длина взлётно-посадочной полосы для взлета - " + minimumRunwayLengthForTakeOff + "м\nРазмах крыльев: - " + wingspan + "м\nКоличество пассажиров - " + numberOfPassengersOnThePlane + "\nНаличие бизнес класса - " + businessClassOnThePlane + "\nМаксимальная скорость - " + maximumSpeed + "км/ч\nМасса - " + weight + "кг\nМОЩНОСТЬ В КИЛОВАТТАХ - " + valuesInKilowatts + "кВ");
    }

    @Override
    public void executionOfTheMethodForAirplanes() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество пассажиров: ");
        this.theNumberOfPassengersOnThePlaneForBoarding = Double.parseDouble(in.nextLine());
        if (theNumberOfPassengersOnThePlaneForBoarding > numberOfPassengersOnThePlane) {
            System.out.println("Количество мест в самолёте меньше желаемых мест для посадки!");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        } else {
            System.out.println("Добро пожаловать на борт");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void outputOfAllMethods() {
        descriptionOfCivilAirTransport();
        calculationInKilowatts();
        executionOfTheMethodForAirplanes();
    }
}


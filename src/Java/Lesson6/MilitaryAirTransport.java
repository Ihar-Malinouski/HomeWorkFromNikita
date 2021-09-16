package Java.Lesson6;

import javax.swing.*;
import java.util.Scanner;

public class MilitaryAirTransport extends AirTransport {
    boolean ejectionSystem;
    int numberOfMissilesOnBoard;
    private double numberOfPassengersOnThePlane;
    private double numberOfRocketShots;

    public MilitaryAirTransport(int wingspan, int minimumRunwayLengthForTakeOff, int power, String brand, double weight, double maximumSpeed, boolean ejectionSystem, int numberOfMissilesOnBoard) {
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
        this.power = power;
        this.brand = brand;
        this.weight = weight;
        this.maximumSpeed = maximumSpeed;
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    public void descriptionOfMilitaryAerialTransport() {
        System.out.println("Марка самолёта - " + brand + "\nМощность - " + power + "л/с\nМинимальная длина взлётно-посадочной полосы для взлета - " + minimumRunwayLengthForTakeOff + "м\nРазмах крыльев: - " + wingspan + "м\nКоличество ракет на борту - " + numberOfMissilesOnBoard + "\nНаличие системы катапультирования - " + ejectionSystem + "\nМаксимальная скорость - " + maximumSpeed + "км/ч\nМасса - " + weight + "кг\nМОЩНОСТЬ В КИЛОВАТТАХ - " + valuesInKilowatts + "кВ");
    }

    public void calculationInKilowatts() {
        valuesInKilowatts = 0.74 * power;
    }

    @Override
    public void executionOfTheMethodForAirplanes() {
        Scanner in = new Scanner(System.in);
        System.out.print("Нажмите '1', если хотите выстрели, либо '0', если не хотите стрелять: ");
        this.numberOfRocketShots = Double.parseDouble(in.nextLine());
        if (numberOfRocketShots == 1 & numberOfMissilesOnBoard > 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    @Override
    public void outputOfAllMethods() {
        descriptionOfMilitaryAerialTransport();
        calculationInKilowatts();
        executionOfTheMethodForAirplanes();
        bailout();
    }

    public void bailout() {
        if (!ejectionSystem) {
            System.out.println("У Вас нет системы катапультирования!");
        } else {
            System.out.println("Катапультирование прошло успешно");
        }
    }
}



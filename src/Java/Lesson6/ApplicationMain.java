package Java.Lesson6;

public class ApplicationMain {
    public static void main(String[] args) {
        CivilAirTransport CivilAirTransport = new CivilAirTransport(990, true, 150, 250, 24555, "AirBus", 10550, 945);
        CivilAirTransport.outputOfAllMethods();
        MilitaryAirTransport MilitaryAirTransport = new MilitaryAirTransport(310, 145, 8856, "Boing", 12445, 650.5, false, 1);
        MilitaryAirTransport.outputOfAllMethods();
        FreightLandTransport FreightLandTransport = new FreightLandTransport(125, "MAZ", 4550, 185, 4, 10.5, 880);
        FreightLandTransport.outputOfAllMethods();
        LightLandTransport LightLandTransport = new LightLandTransport(125, "AUDI", 2150, 185, 4, 12, "Седан", 5);
        LightLandTransport.outputOfAllMethods();
    }
}

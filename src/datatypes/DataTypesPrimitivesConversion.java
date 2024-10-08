package datatypes;

public class DataTypesPrimitivesConversion {

    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 234523452345234623L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1.5234523423423e-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + "ccm");
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + " g/km");
        System.out.println("Emission sticker: " + emissionSticker + " ( Energy efficiency category: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra Urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short nuwNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats: " + nuwNumberOfSeats);
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        System.out.println("The new value of combined fuel consumption: " + newFuelConsumptionCombined + "l/100km");

        byte newPower = (byte) power;
        System.out.println("The value of the new power: " + newPower + "kW");

    }
}
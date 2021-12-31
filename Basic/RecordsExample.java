package JAVA.Basic;

public class RecordsExample {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Mercedes Maybach", "S 650 Guard");

        System.out.println(vehicle.brand());
        System.out.println(vehicle.licensePlate());

        System.out.println(vehicle.toString());

    }
}


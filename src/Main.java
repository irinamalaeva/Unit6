public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger();

        passenger.quantityPassenger = 4;
        passenger.type = "sedan ";
        passenger.quantityWheel = 4;
        passenger.fuelConsumption = 7.2;
        passenger.power = 5;
        passenger.velocityMax = 150;
        passenger.weight = 800;
        passenger.brand = "Nissan";
        System.out.println(passenger.describe());
        passenger.describe1();
        passenger.waylength(2.5);


        Cargo cargo = new Cargo();

        cargo.power = 400;
        cargo.velocityMax = 110;
        cargo.weight = 5000;
        cargo.brand = "Scania";
        cargo.loadCapacity = 30;
        cargo.quantityWheel = 12;
        cargo.fuelConsumption = 27;
        System.out.println(cargo.describe());
        cargo.describe1();
        cargo.cargoLoad(31);

        Civil civil = new Civil();

        civil.power = 9000;
        civil.velocityMax = 1200;
        civil.weight = 150000;
        civil.brand = "Boeing";
        civil.wings = 50;
        civil.length = 1200;
        civil.passengerAirCapacity = 300;
        civil.passengerAir = 300;
        civil.businessCivil = false;
        System.out.println(civil.describe());
        civil.describe2();
        civil.pasAir();
        civil.business();

        Military military = new Military();

        military.power = 9000;
        military.velocityMax = 2400;
        military.weight = 30000;
        military.brand = "Boeing";
        military.wings = 30;
        military.length = 50;
        military.missileQuantity = 3;
        military.catapult = true;
        System.out.println(military.describe());
        military.describe2();
        military.shot();
        military.isCatapult();
    }
}

import java.util.Scanner;

public class Transp {
    public static void main(String[] args) {
        class Transport {
            Transport transport = new Transport();
            //Terrestrial terrestrial = new terrestrial();
            int power;
            String unitPower;
            int velocityMax;
            String unitVelocity;
            int weight;
            String unitWeight;
            boolean businessTr;

            void recalculate() {

            }
        }
        class Terrestrial extends Transport {
            int quantityWheel;
            int fuelConsumption;
            String unitFuelConsumption;
        }
        class Air extends Transport {
            int wings;
            String unitWings;
            int length;
        }
        class Passenger extends Terrestrial {
            int passengerTer;
            String brand;


            public String describe() {

            }

            void way() {
                Scanner sc = new Scanner(System.in);

                System.out.println("input time /hour/ = ");
                int time = sc.nextInt();
                System.out.println(" time for calculation = ");
                System.out.println("input velocityMax = ");
                int velocityMax = sc.nextInt();
                System.out.println("velocity maximum chosen car / km/hour= ");
                int waylength = time * velocityMax;
                System.out.println("input fuel consumption / for 100 km/ = ");
                double fuelConsumption = sc.nextInt();
                System.out.println("fuel consumption for chosen car = ");
                double fuel = fuelConsumption * waylength /100;
                System.out.println("За время " + time + " ч, автомобиль" + brand + " , двигаясь с максимальной скоростью"
                        + velocityMax + " км/ч, проедет " + waylength + "   км и израсходует " +
                        fuel + "литров топлива");
            }


        }
        class Cargo extends Terrestrial {
            int cargo;
            String unitCargo;
        }
        class Civil extends Air {
            int passengerAir;
            boolean businessCivil;
        }
        class Military extends Air {
            int missile;
            boolean catapult;
        }

    }


}

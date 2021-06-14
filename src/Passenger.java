
public class Passenger extends Terrestrial {

    public int quantityPassenger;
    public String type;

    public void waylength(double time) {
        double waylength = time * velocityMax;

        System.out.println("За время " + time + " ч, автомобиль " + brand +
                " , двигаясь с максимальной скоростью = "
                + velocityMax + " км/ч, проедет " + waylength + " км и израсходует " +
                fuel(waylength) + " литров топлива." + "\n" +
                " Количество пассажиров возможное = " + quantityPassenger + "; тип автомобиля - "
                + type + "\n");
    }

    private double fuel(double waylength) {

        double fuel = fuelConsumption * waylength / 100;
        return fuel;
    }


}




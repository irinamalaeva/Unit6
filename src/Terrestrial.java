
public abstract class Terrestrial extends Transport {
    public int quantityWheel;
    public double fuelConsumption;

    public void describe1() {
        System.out.println(" quantity of wheel = " + quantityWheel + "; consumption of fuel = "
                + fuelConsumption + " л/100км ;");
    }
}

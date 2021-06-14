
public abstract class Transport {
    public int power;
    public double velocityMax;
    public int weight;
    public String brand;

    public double recount() {
        double powerCBt = 0.74 * power;
        return powerCBt;
    }

    public String describe() {
        return " brand: " + brand + "; velocityMax = " +
                velocityMax + " км/ч " + "; weigth = " + weight + " кг " + "; powerCBt = " + recount()
                + " кВт ";
    }

}







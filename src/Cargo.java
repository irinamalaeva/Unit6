
public class Cargo extends Terrestrial {
    public int loadCapacity;

    public void cargoLoad(int cargo) {
        if (loadCapacity >= cargo) {
            System.out.println("Грузовик загружен, масса груза в тоннах = " +
                    +cargo + "\n");
        } else {
            System.out.println(" Вам нужен грузовик побольше" +
                    " возможности автомобиля = " + loadCapacity +
                    "< массы предполагаемого груза" + cargo + "\n");
        }
    }

}

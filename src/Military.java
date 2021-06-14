
public class Military extends Air {
    public int missileQuantity;
    public boolean catapult;
    private int counter = 1;

    public void shot() {

        if (counter <= missileQuantity) {
            System.out.println(" Ракета пошла ");
        } else {
            System.out.println(" Боеприпасы отсутствуют ");
            return;
        }
        counter++;
    }

    public void isCatapult() {
        if (catapult) {
            System.out.println(" Катапультирование прошло успешно ");
        } else {
            System.out.println(" Катапультирование : У вас нет такой системы ");
        }
    }

}
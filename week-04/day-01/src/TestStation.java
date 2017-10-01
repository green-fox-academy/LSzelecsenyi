public class TestStation {
    public static void main(String[] args) {

        Car oto = new Car();
        Station mol = new Station();

        mol.refillCar(oto);

        System.out.println("Remaining petrol in petrol station: " + mol.gasAmmount);
        System.out.println("Gasammount in car: " + oto.gasAmmount);


    }

}

public class Station {

    int gasAmmount = 1000;

    public int refillCar (Car car) {
        gasAmmount = gasAmmount - car.capacity;
        car.gasAmmount = car.gasAmmount + car.capacity;
        return gasAmmount;
    }
}

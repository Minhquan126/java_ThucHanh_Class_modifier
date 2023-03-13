package car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("VinFast","VF6");
        System.out.println(Car.carOfNumber);
        System.out.println(car1);
        Car car2 = new Car("VinFast","VF8");

        System.out.println(" car 2 : " + Car.carOfNumber);
        System.out.println(car2);
    }
}

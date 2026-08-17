import com.trucks.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Toyota", "Corola");
        car.accelerate();
        car.accelerate();
        car.showInfo();
    }
}

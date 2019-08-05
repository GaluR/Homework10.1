public class TestClass {
    public static void main(String[] args) {
        Car[] vehicles = new Car[3];
        vehicles[0] = new Car("Ford", 50, 5.8,false);
        vehicles[1] = new Car("Nissan", 60, 7.0,false);
        vehicles[2] = new Truck("Star", 120, 11.1, false,350);

        vehicles[0].showInfo();
        vehicles[2].showInfo();
        vehicles[1].showInfo();
        vehicles[0].turnON();
        vehicles[1].turnON();
        vehicles[2].turnON();
        vehicles[0].showInfo();
        vehicles[2].showInfo();
        vehicles[1].showInfo();
    }
}

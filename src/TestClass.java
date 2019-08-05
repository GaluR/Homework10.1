public class TestClass {
    public static void main(String[] args) {
        Car[] vehicles = new Car[3];
        vehicles[0] = new Car("Ford", 50, 5.8, false);
        vehicles[1] = new Car("Nissan", 60, 7.0, false);
        vehicles[2] = new Truck("Star", 120, 11.1, false, 350);
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].showInfo();
        }
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setAirConditioning(true);
        }
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].showInfoIsON();
        }
    }
}

public class Truck extends Car {
    private double weightCargo;
    public double AIR_CONDITION_IS_ON_TRUCK = 1.6;
    public double WEIGHT_CARGO = 0.5;

    public double getWeightCargo() {
        return weightCargo;
    }
    public void setWeightCargo(double weightCargo) {
        this.weightCargo = weightCargo;
    }
    public Truck(String name, double tankCapacity, double averageCombustion, boolean airConditioning, double weightCargo) {
        super(name, tankCapacity, averageCombustion, airConditioning);
        this.weightCargo = weightCargo;
    }

    @Override
    public double average(double value) {
        return super.average(value);
    }

    @Override
    public double range() {
        return getTankCapacity()/(super.average(AIR_CONDITION_IS_ON_TRUCK) + (getWeightCargo() * WEIGHT_CARGO)/100)*100;
    }
    @Override
    public void showInfo() {
        System.out.printf("Ciężarówka %s przejedzie na pełnym baku z wyłączoną klimatyzacją %.2f km\n", getName(), range());
    }
    @Override
    public void showInfoIsON() {
        System.out.printf("Ciężarówka %s przejedzie na pełnym baku z włączoną klimatyzacją %.2f km\n", getName(), range());
    }
}

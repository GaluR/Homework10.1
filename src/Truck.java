public class Truck extends Car {
    private double weightCargo;

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
    public double isON() {
        if(isAirConditioning()){
            setAverageCombustion(getAverageCombustion()+ AIR_CONDITION_IS_ON_TRUCK);
        }
        return getTankCapacity()/(getAverageCombustion()+(getWeightCargo()/100 * WEIGHT_CARGO))*100;
    }

    @Override
    public void showInfo() {
        System.out.printf("Ciężarówka %s przejedzie na pełnym baku z wyłączoną klimatyzacją %.2f km\n", getName(), isON());
    }

    @Override
    public void showInfoIsON() {
        System.out.printf("Ciężarówka %s przejedzie na pełnym baku z włączoną klimatyzacją %.2f km\n", getName(), isON());
    }
}

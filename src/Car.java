public class Car extends Vehicle {
    private boolean airConditioning;
    public double AIR_CONDITION_IS_ON_CAR = 0.8;

    public boolean isAirConditioning() {
        return airConditioning;
    }
    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }
    public Car(String name, double tankCapacity, double averageCombustion, boolean airConditioning) {
        super(name, tankCapacity, averageCombustion);
        this.airConditioning = airConditioning;
    }
    public double average(double value){
        if(airConditioning){
            setAverageCombustion(getAverageCombustion() + value);
        }
        return getAverageCombustion();
    }
    public double range(){
        return getTankCapacity()/average(AIR_CONDITION_IS_ON_CAR)*100;
    }
    public void showInfo(){
        System.out.printf("Samochód %s przejedzie na pełnym baku z wyłączoną klimatyzacją %.2f km\n",getName(), range());
    }
    public void showInfoIsON(){
        System.out.printf("Samochód %s przejedzie na pełnym baku z włączoną klimatyzacją %.2f km\n",getName(), range());
    }
}

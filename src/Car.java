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
           return getTankCapacity()/(getAverageCombustion() + value)*100;
        }else{
        return getTankCapacity()/getAverageCombustion()*100;
    }
    }
    public void showInfo(){
        System.out.printf("Pojazd %s przejedzie na pełnym baku z %s klimatyzacją %.2f km\n",getName(), isAirConditioning(), average(AIR_CONDITION_IS_ON_CAR));
    }
}

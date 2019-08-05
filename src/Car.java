public class Car extends Vehicle {
    private boolean airConditioning;

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

    public double isON(){
        if(airConditioning){
            setAverageCombustion(getAverageCombustion()+ AIR_CONDITION_IS_ON_CAR);
        }
        return (getTankCapacity()/getAverageCombustion())*100;
    }
    public void showInfo(){
        System.out.printf("Samochód %s przejedzie na pełnym baku z wyłączoną klimatyzacją %.2f km\n",getName(), isON());
    }

    public boolean turnON(){
        setAirConditioning(true);
        return isAirConditioning();
    }
    public void showInfoIsON(){
        System.out.printf("Samochód %s przejedzie na pełnym baku z włączoną klimatyzacją %.2f km\n",getName(), isON());
    }
}

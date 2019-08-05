public class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageCombustion;

    public Vehicle(String name, double tankCapacity, double averageCombustion) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageCombustion = averageCombustion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTankCapacity() {
        return tankCapacity;
    }
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public double getAverageCombustion() {
        return averageCombustion;
    }
    public void setAverageCombustion(double averageCombustion) {
        this.averageCombustion = averageCombustion;
    }
}

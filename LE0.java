
public class LE0 {
    String name;
    double mileage;
    private int speed;
    public Car(String name, double mileage, int speed) {
        this.name = name;
        this.mileage = mileage;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static void main(String[] args) { 
        Car myCar = new Car("Toyota", 15.5, 120);
        System.out.println("Car Name: " + myCar.getName());
        System.out.println("Car Mileage: " + myCar.getMileage() + " km/l");
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
        myCar.setName("Honda");
        myCar.setMileage(17.0);
        myCar.setSpeed(130);
        System.out.println("\nUpdated Car Details:");
        System.out.println("Car Name: " + myCar.getName());
        System.out.println("Car Mileage: " + myCar.getMileage() + " km/l");
        System.out.println("Car Speed: " + myCar.getSpeed() + " km/h");
    }
}

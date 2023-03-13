package car;

public class Car {
    private String name;
    private String engineer;
    public static int carOfNumber;
    public Car(String name,String engineer) {
        this.name = name;
        this.engineer = engineer;
        carOfNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineer() {
        return engineer;
    }

    public void setEngineer(String engineer) {
        this.engineer = engineer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engineer='" + engineer + '\'' +
                '}';
    }
}

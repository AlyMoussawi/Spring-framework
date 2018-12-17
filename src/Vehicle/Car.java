package Vehicle;

public class Car {

    private String name;
    private String model;

    public static Car factoryMethod() {
        System.out.println("ca marche");
        return new Car();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}

package unitTesting;

public class Rider {
    private String name;
    private Motorcycle motorcycle;

    public Rider(String name, Motorcycle motorcycle) {
        this.setName(name);
        this.setMotorcycle(motorcycle);
    }

    public String getName() {
        return this.name;
    }

    public Motorcycle getMotorcycle() {
        return this.motorcycle;
    }

    private void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", motorcycle=" + motorcycle +
                '}';
    }
}

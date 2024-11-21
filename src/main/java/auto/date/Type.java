package auto.date;

public enum Type {
    Moto("Motorcycle"), Auto("Vehicle"), Bus("Bus");
    private String name;
    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                '}';
    }
}

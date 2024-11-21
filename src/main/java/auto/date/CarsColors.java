package auto.date;

public enum CarsColors {
    RED ("Super Red "), YELL("Supper Yellow"), WITHE("Super Withe");

    private String name;

    CarsColors(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "CarsColors{" +
                "name='" + name + '\'' +
                '}';
    }
}

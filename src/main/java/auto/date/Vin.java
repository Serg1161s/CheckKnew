package auto.date;

public class Vin {
    private String vin;
    private static int count;
    private static final String VIN_PREF = "AUTO_MOTO_";

    public Vin() {
        this.vin = VIN_PREF+(331000 + ++count);
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Vin{" +
                "vin='" + vin + '\'' +
                '}';
    }
}

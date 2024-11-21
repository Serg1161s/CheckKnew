package auto.types;

import auto.date.CarsColors;
import auto.date.Type;
import auto.date.Vin;

public abstract class AutoMoto {
    private Type type;
    private Vin vin;
    private CarsColors color;

     public AutoMoto(CarsColors color, Type type) {
         setColor(color);
         setVin();
         setType(type);
     }

    public CarsColors getColor() {
        return color;
    }

    public void setColor(CarsColors color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Vin getVin() {
        return vin;
    }

    public void setVin() {
         if (vin == null) {
             this.vin = new Vin();
         } else {
             System.out.println("Vin was already created");
         }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "color=" + color +
                ", type=" + type +
                ", vin=" + vin +
                '}';
    }
}

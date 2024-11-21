package garage;

import auto.types.Auto;
import auto.types.AutoMoto;

import java.util.ArrayList;
import java.util.Arrays;

public class Garage <T extends AutoMoto> {
    ArrayList<T> garage;

    public Garage() {
        this.garage = new ArrayList<>();
    }

    public void addAutoMoto (T auto){
        garage.add(auto);
    }
    public void addAllAutoMoto (T... autos){
        garage.addAll(Arrays.asList(autos));
    }

    public void printGarage (){
        this.garage.stream().forEach(System.out::println);
    }
}

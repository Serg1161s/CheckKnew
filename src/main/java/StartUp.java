import auto.types.Auto;
import auto.types.AutoMoto;
import auto.types.Bus;
import auto.types.Moto;
import auto.date.CarsColors;
import garage.Garage;

public class StartUp {
    public static void main(String[] args) {


        Garage<AutoMoto> garage = new Garage<>();
        garage.addAutoMoto(new Auto(CarsColors.RED));
        garage.addAllAutoMoto(new Auto(CarsColors.RED), new Moto(CarsColors.WITHE), new Bus(CarsColors.YELL));
        garage.printGarage();

    }
}

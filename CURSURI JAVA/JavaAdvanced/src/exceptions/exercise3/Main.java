package exceptions.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        carRepository.addCar(new Sedan("a", 2006));
        carRepository.addCar(new Sedan("b", 2007));
        carRepository.addCar(new Sedan("c", 2008));
        carRepository.addCar(new OffRoadCar("d", 2006));
        carRepository.addCar(new OffRoadCar("e", 2006));
        carRepository.addCar(new OffRoadCar("f", 2006));

        Scanner scanner = new Scanner(System.in);
        String id;
        id = scanner.nextLine();
        try {
            carRepository.searchCarByID(id);
        }catch (CarNotFoundException e){
            System.out.println("Car was not found by parameter " +e.getParameterName());
        }

    }
//do while cat sunt masini in lista sa intrebati omul daca vrea sa cauta dupa id sau name sau sa stearga.
}

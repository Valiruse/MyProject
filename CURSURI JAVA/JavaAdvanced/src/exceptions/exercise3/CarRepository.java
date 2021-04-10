package exceptions.exercise3;

public interface CarRepository {

    void addCar(Car car);

    void removeCar(String id);

    Car searchCarByName(String name)throws CarNotFoundException;

    Car searchCarByID(String id) throws CarNotFoundException;

    int getSize();

}

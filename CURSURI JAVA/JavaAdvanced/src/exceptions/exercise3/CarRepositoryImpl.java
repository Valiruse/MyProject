package exceptions.exercise3;

public class CarRepositoryImpl implements CarRepository {

    private Car[] cars = new Car[10];
    private int index = 0;
    @Override
    public void addCar(Car car) {
        cars[index] = car;
        index++;
    }
    @Override
    public void removeCar(String id) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(id)) {
                cars[i] = null;
            }
        }
    }
    @Override
    public Car searchCarByName(String name) throws CarNotFoundException {
        for (Car car : cars) {
            if (car != null) {
                if (car.getName().equals(name)) {
                    return car;
                }
            }
        }
        throw new CarNotFoundException("search by ID: ", name);
    }
    @Override
    public Car searchCarByID(String id) throws CarNotFoundException {
        for (Car car : cars) {
            if (car != null) {
                if (car.getId().equals(id)) {
                    return car;
                }
            }
        }
        throw new CarNotFoundException("search by ID: ", id);
    }
    @Override
    public int getSize() {
        int index = 0;
        for (Car car : cars) {
            if (car != null)
                index++;
        }
        return index;
    }
}

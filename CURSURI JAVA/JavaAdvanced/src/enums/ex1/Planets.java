package enums.ex1;

public enum Planets {

    JUPITER(5, "Jupiter"),
    PLUTO(245, "Pluto"),
    EARTH(169,"Earth");


    double dimension;
    String name;
    double distanceFromEarth;

    Planets(double dimension, String name) {
        this.dimension = dimension;
        this.name = name;

    }

    @Override
    public String toString() {
        return name + " " + dimension;
    }

    public double distanceFromEarth() {
        return distanceFromEarth;

    }
}

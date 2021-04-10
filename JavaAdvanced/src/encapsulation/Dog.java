package encapsulation;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;

    public Dog(String name, int age, String gender, String race) {
        this.name = name;
        this.age = age;
        if (gender.equals("f") || gender.equals("m")) {
            this.gender = gender;
        } else {

            throw new IllegalStateException("Invalid gender");
        }
        this.gender = gender;
        this.race = race;
    }

    public Dog(String gender, String race) {
        this("Mihai", 12, gender, race);

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }
}

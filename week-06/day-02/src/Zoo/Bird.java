package Zoo;

public class Bird extends Animal {

    public Bird(int age, String gender, int weight) {
        name = "Zoo.Bird";
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Bird(String name) {
        this.name = name;
        age = 0;
        gender = "M/F";
        weight = 1;
    }

    @Override
    public String greet() {
        return getName() + " says chip-chip";
    }

    @Override
    public String wantChild() {
        return "want a child from an egg!";
    }
}

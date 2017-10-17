package Zoo;

public class Mammal extends  Animal {

    public Mammal(int age, String gender, int weight) {
        name = "Zoo.Mammal";
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Mammal(String name) {
        this.name = name;
        age = 0;
        gender = "M/F";
        weight = 1;
    }

    @Override
    public String greet() {
        return  getName() + " says: Moooo";
    }

    @Override
    public String wantChild() {
        return "want a child from her uterus!";
    }
}

package Zoo;

public class Reptile extends  Animal {

    public Reptile(int age, String gender, int weight) {
        name = "Zoo.Reptile";
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public Reptile(String name) {
        this.name = name;
        age = 0;
        gender = "M/F";
        weight = 1;
    }

    @Override
    public String greet() {
        return " says: frrrr";
    }

    @Override
    public String wantChild() {
        return "want a child from an egg!";
    }



}

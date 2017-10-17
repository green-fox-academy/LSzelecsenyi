package Zoo;

public abstract class Animal {
    int age;
    String name;
    String gender;
    int weight;

    public abstract String greet();

    public abstract String wantChild();

    public String getName() {
        return name;
    }
}

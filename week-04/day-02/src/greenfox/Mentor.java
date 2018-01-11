package greenfox;

public class Mentor extends Person {
    String level;

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " +  getAge() + " year old " +  getGender() + " " + getLevel() + " mentor.");
    }

    public String getLevel() {
        return level;
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }

}

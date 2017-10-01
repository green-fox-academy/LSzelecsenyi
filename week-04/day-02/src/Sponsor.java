public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        super("Jane Doe", 30, "female");
        this.company = "Google";
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " years old " + getGender() + " who represents " + getCompany() + " and hired " + getHiredStudents() + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudents++;
    }

    public String getCompany() {
        return company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }
}

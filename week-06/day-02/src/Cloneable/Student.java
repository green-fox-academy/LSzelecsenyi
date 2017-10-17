package Cloneable;

public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;

    @Override
    public Student clone()throws CloneNotSupportedException{
        return (Student) super.clone();
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old  " + getGender() + " from " + getPreviousOrganization() + " who skipped " + getSkippedDays() + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School of Life");
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }
}

import java.util.ArrayList;

public class PallidaClass {

    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public PallidaClass(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println(getName() + " class has " + getStudentNumber() + " students and " + getMentorNumber() + " mentors.");
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return students.size();
    }

    public int getMentorNumber() {
        return mentors.size();
    }
}

//    Create Student and Teacher classes
//            Student   learn()
//    question(teacher) -> calls the teachers answer method
//            Teacher
//    teach(student) -> calls the students learn method
//    answer()
public class Teacher {

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {
        System.out.println("Why don't you understand it you ba***rd?");
    }
}

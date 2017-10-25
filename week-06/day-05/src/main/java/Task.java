import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Task {

    String whatToDo;
    int id;
    LocalDateTime createdAt;
    LocalDateTime completedAt;

    public Task(String whatToDo, LocalDateTime createdAt, int id) {
        this.whatToDo = whatToDo;
        this.createdAt = createdAt;
        this.id = id;
    }
}

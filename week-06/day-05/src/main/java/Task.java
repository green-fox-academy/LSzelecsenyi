import java.time.LocalDate;
import java.util.Date;

public class Task {

    String whatToDo;
    int id;
    LocalDate createdAt;
    LocalDate completedAt;

    public Task() {
        createdAt = LocalDate.now();
    }
}

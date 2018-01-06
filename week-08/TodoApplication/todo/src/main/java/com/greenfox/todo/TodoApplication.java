package com.greenfox.todo;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    public static final String START_THE_DAY = "Start the day";

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (todoRepository.count() == 0) {
            todoRepository.save(new Todo("Make a to do List", true, true, LocalDateTime.now().minusMinutes(5), LocalDateTime.now().minusMinutes(3)));
            todoRepository.save(new Todo("Check first thing on to do list", true, true, LocalDateTime.now().minusMinutes(4), LocalDateTime.now().minusMinutes(2)));
            todoRepository.save(new Todo("Realize you've already accomplished two things", true, true, LocalDateTime.now().minusMinutes(3), LocalDateTime.now().plusMinutes(1)));
            todoRepository.save(new Todo("Reward yourself with a nap", true, false, LocalDateTime.now().minusMinutes(2), LocalDateTime.now().plusMinutes(2)));
            todoRepository.save(new Todo("Make vanilla pudding, put it into a mayo jar and eat it public", true, false, LocalDateTime.now().minusDays(3).minusHours(2), LocalDateTime.now().plusHours(3)));
            todoRepository.save(new Todo("Hire two private investigators, get them to follow eachother", false, false, LocalDateTime.now().minusMinutes(1380), LocalDateTime.now().plusDays(5)));
            todoRepository.save(new Todo("Get into an elevator and say: 'I bet you're all wondering why I gathered you here today!'", true, false, LocalDateTime.now().minusMinutes(1000), LocalDateTime.now().plusMinutes(1200)));
            todoRepository.save(new Todo("Run into a store and ask what year it is. When someone answeres yell 'It worked' and run out cheering: ", true, false, LocalDateTime.now().minusDays(2), LocalDateTime.now().plusMinutes(4)));
            todoRepository.save(new Todo("Change name to Simon. Speak in third person", true, false, LocalDateTime.now().minusDays(10), LocalDateTime.now().plusDays(5)));
            todoRepository.save(new Todo("Follow joggers around in your car blasting 'Eye of the Tiger' for encouragement", true, false, LocalDateTime.now().minusHours(17), LocalDateTime.now().plusHours(2)));
        } if (assigneeRepository.count() == 0) {
            assigneeRepository.save(new Assignee("Mikorka Kalman", "mikorkakalman@gmail.com"));
            assigneeRepository.save(new Assignee("Metal Ica", "metallica@gmail.com"));
        }
    }
}

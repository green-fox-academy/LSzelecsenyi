package com.greenfox.todo;

import com.greenfox.todo.model.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {

    @Bean
    Todo todo() {
        return new Todo();
    }

}

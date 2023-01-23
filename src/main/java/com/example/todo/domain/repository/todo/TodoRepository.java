package com.example.todo.domain.repository.todo;
import java.util.Collection;
import com.example.todo.domain.model.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoRepository {
    Todo findOne(String todoId);
    Collection<Todo> findAll();
    void create(Todo todo);
    boolean update(Todo todo);
    void delete(Todo todo);
    long countByFinished(boolean finished);
}


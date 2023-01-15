package com.example.todo.domain.repository.todo;

import com.example.todo.domain.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TodoRepositoryImpl implements TodoRepository {
    private static final Map<String, Todo> TODO_MAP = new ConcurrentHashMap<String, Todo>();

    @Override
    public Todo findOne(String todoId){
        return TODO_MAP.get(todoId);
    }

    @Override
    public Collection<Todo> findAll() {
        return TODO_MAP.values();
    }

    @Override
    public void create(Todo todo){

        TODO_MAP.put(todo.getTodoId(), todo);
        TODO_MAP.put(String.valueOf(todo.getKigen()), todo);
    }
    @Override
    public boolean update(Todo todo){
        TODO_MAP.put(todo.getTodoTitle(), todo);
        return  true;
    }
    @Override
    public void delete(Todo todo){
        TODO_MAP.remove(todo.getTodoId());
    }
    @Override
    public long countByFinished(boolean finished){
        long count = 0;
        for (Todo todo : TODO_MAP.values()){
            if(finished == todo.isFinished()){
                count++;
            }
        }
        return count;
    }
}

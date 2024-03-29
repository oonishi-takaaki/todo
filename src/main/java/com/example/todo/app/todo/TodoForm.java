package com.example.todo.app.todo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class TodoForm implements Serializable {
    public interface TodoCreate {
    }

    public interface TodoFinish {
    }

    public interface TodoDelete {
    }

    private static final long serialVersionUID = 1L;

    @NotNull(groups = {TodoFinish.class, TodoDelete.class})
    private String todoId;

    @NotNull(groups = {TodoCreate.class})
    @Size(min = 1, max = 30, groups = {TodoCreate.class})
    private String todoTitle;

    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }
}

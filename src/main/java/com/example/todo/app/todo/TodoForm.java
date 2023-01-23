package com.example.todo.app.todo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date todoKigen;

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

    public Date getTodoKigen() {
        return todoKigen;
    }

    public void setTodoKigen(Date todoKigen) {
        this.todoKigen = todoKigen;
    }
}

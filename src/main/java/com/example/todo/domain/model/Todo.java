package com.example.todo.domain.model;

import java.io.Serializable;
import java.util.Date;

public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String todoId;
    private String todoTitle;
    private boolean finished;
    private Date created_At;
    private Date Kigen;

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

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Date getCreatedAt() {
        return created_At;
    }

    public void setCreatedAt(Date created_At) {
        this.created_At = created_At;
    }

    public Date getTodoKigen() {
        return Kigen;
    }

    public void settodoKigen(Date Kigen) {
        this.Kigen = Kigen;
    }

}

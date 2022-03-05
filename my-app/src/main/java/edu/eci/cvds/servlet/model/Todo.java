package edu.eci.cvds.servlet.model;

public class Todo {

    int UserId;
    int Id;
    String Title;
    Boolean Completed;

    public Todo() {
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public Boolean getCompleted() {
        return Completed;
    }

    public void setCompleted(Boolean completed) {
        this.Completed = completed;
    }

}

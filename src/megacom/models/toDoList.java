package megacom.models;

import megacom.enums.toDoStatus;

import java.util.Calendar;
import java.util.Date;

public class toDoList {

    private int id;
    private String description;
    private Calendar startToDo;
    private Calendar endToDo;
    private toDoStatus toDoStatus;

    public toDoList(int id, String description, Calendar startToDo, Calendar endToDo) {
        this.id = id;
        this.description = description;
        this.startToDo = startToDo;
        this.endToDo = endToDo;
        this.toDoStatus = toDoStatus.OPEN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getStartToDo() {
        return startToDo;
    }

    public void setStartToDo(Calendar startToDo) {
        this.startToDo = startToDo;
    }

    public Calendar getEndToDo() {
        return endToDo;
    }

    public void setEndToDo(Calendar endToDo) {
        this.endToDo = endToDo;
    }

    public megacom.enums.toDoStatus getToDoStatus() {
        return toDoStatus;
    }

    public void setToDoStatus(megacom.enums.toDoStatus toDoStatus) {
        this.toDoStatus = toDoStatus;
    }
}

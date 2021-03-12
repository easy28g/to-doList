package megacom;

import megacom.service.toDoListService;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        toDoListService task = toDoListService.INSTANCE;
        task.createTask();
        task.outputToDoList();

    }
}

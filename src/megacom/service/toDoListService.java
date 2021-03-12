package megacom.service;

import megacom.service.impl.toDoListServiceImpl;

import java.text.ParseException;

public interface toDoListService {

    toDoListService INSTANCE = new toDoListServiceImpl();

    boolean createTask() ;
    void outputToDoList();

}

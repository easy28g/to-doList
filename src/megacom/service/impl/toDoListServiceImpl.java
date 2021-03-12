package megacom.service.impl;

import megacom.models.toDoList;
import megacom.service.toDoListService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class toDoListServiceImpl implements toDoListService {

    Scanner scan = new Scanner(System.in);

    List<toDoList> lists = new LinkedList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public boolean createTask() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String yn; int i=1;
        do{
            System.out.println("Do you want add task  y/n - ?");
            yn = scan.next();

            if(yn.equals("y")){

                System.out.println("Description of task: ");
                String description = scan.next();

                System.out.println("Start Day");
                System.out.print("Day: ");
                int startDay = scan.nextInt();
                System.out.print("Month: ");
                int startMonth = scan.nextInt();
                System.out.print("Year: ");
                int startYear = scan.nextInt();

                calendar1.set(startYear,startMonth,startDay);

                System.out.println("End Day");
                System.out.print("Day: ");
                int endDay = scan.nextInt();
                System.out.print("Month: ");
                int endMonth = scan.nextInt();
                System.out.print("Year: ");
                int endYear = scan.nextInt();

                calendar2.set(endYear,endMonth, endDay);

                toDoList toDoList = new toDoList(i, description, calendar1, calendar2 );

                lists.add(toDoList);

                i++;
            }
            if(yn.equals("n")){
                break;
            }

        }while(!yn.equals("y")||!yn.equals("n"));

        return false;
    }

    @Override
    public void outputToDoList() {
        for(int i=0; i<lists.size(); i++){
            System.out.println("Description: "+lists.get(i).getDescription());
            System.out.println("Start Day: "+lists.get(i).getStartToDo().getTime().getDate()+"."+lists.get(i).getStartToDo().getTime().getMonth()+"."+lists.get(i).getStartToDo().getTime().getYear());
            System.out.println("End Day: "+lists.get(i).getEndToDo().getTime().getDate()+"."+lists.get(i).getEndToDo().getTime().getMonth()+"."+lists.get(i).getEndToDo().getTime().getYear());
            System.out.println("Status of task: "+lists.get(i).getToDoStatus());
        }
    }


}

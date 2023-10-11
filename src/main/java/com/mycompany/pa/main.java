package main.java.com.mycompany.pa;

public class main 
{
     public static void main(String[] args)
     {
         System.out.println("Welcome to the Linked List Phonebook!");
        int choice;
        do {
            choice = menu();
            switch (choice)
            {
                case 1:
                    addContact();
                    break;
                
                case 2:
                    SearchContact();
                    break;
                
                case 3:
                    DeleteContact();
                    break;
                
                case 4:
                    ScheduleEvent();
                    break;
                
                case 5:
                    PrintEvent();
                    break;
                    
                case 6:
                    PrintContactsFirstName();
                    break;
                    
                case 7:
                    PrintAllEvents();
                    break;
                    
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default :
                    System.out.println("Bad choice! Try again");
            }
            System.out.println("\n\n");
        }while (choice != 8);
    }
        
}
         
    
    
 

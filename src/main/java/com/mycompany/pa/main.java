package main.java.com.mycompany.pa;

import java.util.Scanner;

import java.util.Scanner;

public class main 
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
        int selectedOpt;
        
        while (true)
        {
            selectedOpt = phoneBook.mainMenu();
            
            if(selectedOpt==8)
            {
                System.out.println("Goodbye!");
                break;
            }
            
            switch (selectedOpt)
            {
                case 1:
                    phoneBook.addContact();
                    break;
                case 2:
                    phoneBook.searchContact();
                    break;
                case 3:
                    System.out.println("Enter contact name: ");
                    String name = in.nextLine();
                    phoneBook.delAContact(name);
                    break;
                case 4:
                    phoneBook.eventSchedule();
                    break;
                case 5:
                    phoneBook.displayAllEventsAlphabetically();
                    break;
                case 6:
                    System.out.println("Enter contact name: ");
                    String fname = in.nextLine();
                    phoneBook.displayContactsByFirstName(fname);
                    break;
                case 7:
                    phoneBook.displayAllEvents();
                    break;
                
            }
        }
        
    }
    
}
        

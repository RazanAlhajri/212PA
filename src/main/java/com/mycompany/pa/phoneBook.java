package main.java.com.mycompany.pa;

import java.util.Scanner;
import java.util.Date;

public class phoneBook 
{
    public static Scanner in = new Scanner (System.in);
    public static LinkedListADT <Contact> contactsList = new LinkedListADT <Contact>() ;
    public static LinkedListADT<Event> eventsList = new LinkedListADT <Event>();

    public static int mainMenue()
    {
        System.out.println("1. Add a contact\n" +"2. Search for a contact\n" +"3. Delete a contact\n" +"4. Schedule an event\n" 
                           +"5. Print event details\n" +"6. Print contacts by first name\n" +"7. Print all events alphabetically\n" +"8. Exit");
        int option=in.nextInt();
        return option;
    }
    
    public static int menuOpt2()
    {
       System.out.println("1. Name\n" +"2. Phone Number\n" +"3. Email Address\n" +"4. Address\n" + "5. Birthday");
       int criteria = in.nextInt();
       return criteria;
    }
    
    public static int menuOpt5()
    {
       System.out.println("1. Contact name\n" +"2. Event title" );
       int criteria = in.nextInt();
       return criteria;
    }
     
    public static void addContact()
    {
       
       Contact newcontact = new Contact();
       
       System.out.println("Enter the contact's name: ");
       newcontact.setName(in.nextLine());
       if (/*!contactlist .empty() &&*/ contactsList.search(newcontact))
       {
          System.out.println("contact exist");
          return;
       }
       
       System.out.println("Enter the contact's phone number: ");
       newcontact.setPhoneNumber(in.nextLine());
       if (!contactsList.empty())
       {
          contactsList.findfirst();
          for(int i = 0 ; i<contactsList.size ; i++)
          {
              if (contactsList.retrieve().getPhoneNumber().compareTo(newcontact.getPhoneNumber())== 0)
              {
                System.out.println("contact exist");
                return ;
             }
             contactsList.findnext();
          }
        }
       
       System.out.println("Enter the contact's email address: ");
       newcontact.setEmailAddress(in.nextLine());
       
       System.out.println("Enter the contact's address: ");
       newcontact.setAddress(in.nextLine());
       
       System.out.println("Enter the contact's birthday: ");
       newcontact.setBirthday(in.nextLine());
       
       System.out.println("Enter any notes for the contact: ");
       newcontact.setNotes(in.nextLine());
    }
    
    public static void searchContact()
    {
        boolean found = false;
      
        if(contactsList.empty())
        {
           System.out.println("There no contact yet");
           return;
        }
      
       
        contactsList.findfirst();
        int criteria = menuOpt2();
        switch(criteria)
        {
            case 1:
                System.out.println("Enter the contact's name: ");
                String searchName = in.nextLine();
                   
                for (int i=0; i<contactsList.size;i++)
                {
                    if (contactsList.retrieve().getName().compareTo(searchName)==0)
                    {
                        System.out.println("Contact found! \n" + contactsList.retrieve());
                        found = true;
                        break;
                    }    
                }
                  
                
            case 2:
                System.out.println("Enter the contact's phone number: ");
                String phone =in.nextLine();
                   
                for (int i=0; i<contactsList.size;i++)
                {
                    if (contactsList.retrieve().getPhoneNumber().compareTo(phone)==0)
                    {
                        System.out.println("Contact found! \n" + contactsList.retrieve());
                        found = true;
                        break;
                    }

                }
            case 3:
                System.out.println("Enter the contact's email address: ");
                String email = in.nextLine();
                   
                for (int i=0; i<contactsList.size;i++)
                {
                    if (contactsList.retrieve().getEmailAddress().compareTo(email)==0)
                    {
                        System.out.println("Contact found! \n" + contactsList.retrieve());
                        found = true;
                        break;
                    } 
                }
            case 4:
                System.out.println("Enter the contact's address: ");
                String address = in.nextLine();
                   
                for (int i=0; i<contactsList.size;i++)
                {
                    if (contactsList.retrieve().getAddress().compareTo(address)==0)
                    {
                        System.out.println("Contact found! \n" + contactsList.retrieve());
                        found = true;
                        break;
                    } 
                }
            case 5:
                System.out.println("Enter the contact's birthday: ");
                String birthday = in.nextLine();
                   
                for (int i=0; i<contactsList.size;i++)
                {
                    if (contactsList.retrieve().getBirthday().compareTo(birthday)==0)
                    {
                        System.out.println("Contact found! \n" + contactsList.retrieve());
                        found = true;
                        break;
                    }
                }
        }//end switch
           
        if (!found)
            System.out.println("Contact not found");  
    }//end search method
    
    //we assume that delete a contact is depend on the contact name
    public static void delAContact(String delName)
    { 
       if (contactsList.empty()) 
       {
           System.out.println("there is no contact!");
           return;
       }
       
       boolean found = false;
       contactsList.findfirst();
       for (int i=0; i<contactsList.size;i++)
           {
               Contact tmpContact = contactsList.retrieve(); 
           
               if (contactsList.retrieve().getName().equalsIgnoreCase(delName))
               {
                   contactsList.remove(tmpContact);
                   Event eventOpj = eventsList.retrieve();
                   eventOpj.removeContactFromEvents(tmpContact);
                   System.out.println("Contact deleted successfully!");
                   found = true;
                   return;
           }
        
        if (!found)
            System.out.println("Contact not found");  
       }
    }//end delete method
    
    public static void eventSchedule()
    {
        Contact contact = new Contact();
        Event event = new Event();
        
        System.out.println("Enter event title: ");
        event.setTitle(in.nextLine());
        
        System.out.println("Enter contact name: ");
        contact.setName(in.nextLine());
        
        if(!contactsList.empty() && contactsList.search(contact)== true)
        {
            System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
            event.setDate(new Date(in.next()));
            
            System.out.println("Enter event location: ");
            event.setLocation(in.nextLine());
            
            contact = contactsList.retrieve();
            if(contact.addEvent(event))
            {
                System.out.println("Contact has a conflit");
            }
            else
            {
                System.out.println("Evet added successfully!");  
            }
        }
    }//end schedule method 
    
    public static void displayContactsByFirstName(String name)
    {
        if(contactsList.empty())
            System.out.println("there is no contact!");
        contactsList.findfirst();
        for (int i=0; i<contactsList.size;i++)
        {
            String [] names = contactsList.retrieve().getName().split(" ");
            if (names.length>0&&names[0].equalsIgnoreCase(name))
                System.out.println(contactsList.retrieve().toString());
        }  
    }
    
    public static void displayAllEventsAlphabetically()
    {
        if (eventsList.empty())
            System.out.println("There is no envent!");
        else
        {
            while(!eventsList.last())
            {
                System.out.println(eventsList.retrieve().toString());
                eventsList.findnext();
            }
            System.out.println(eventsList.retrieve().toString());
        }
    }
    
    public static void displayAllEvents()
    {
        int criteria = menuOpt5();
        
        switch(criteria)
        {
            case 1:
                System.out.print("Enter the contact name: ");
                String contactName = in.nextLine();

                boolean contactFound = false;

                for (int i=0; i<contactsList.size;i++)
                {
                if (contactsList.retrieve().getName().equalsIgnoreCase(contactName)) 
                {
                    contactFound = true;
                    System.out.println("Contact found!");
                    
                    Contact currentContact = contactsList.retrieve();
                    for (int j=0;i <currentContact.getEventList().size;j=0) 
                    {
                        if (!currentContact.getEventList().empty() && currentContact.getEventList().search(currentContact.getEventList().retrieve())) 
                        {
                            System.out.println(currentContact.getEventList().retrieve());
                        }
                    }

                    if (currentContact.getEventList().empty()) 
                    {
                        System.out.println("No events found for this contact!");
                    }

                    break; 
                }
                
                if (!contactFound) 
                {
                   System.out.println("Contact not found!");
                }
                break;
                }
        }
    }
}
package com.mycompany.pa;

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
     
    public void addContact(Contact contact)
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
                       //contactsList.findnext();
                   }
                   break;
                
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
                       //contactsList.findnext();
                   }
                   break; 
                
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
                       //contactsList.findnext();
                   }
                   break; 
               
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
                       //contactsList.findnext();
                   }
                   break; 
                
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
                       //contactsList.findnext();
                   }
                   break; 
           }
           
       if (!found)
           System.out.println("Contact not found");  
    }
    
    public static void delAContact()
    {
       Contact contactToDelete = new Contact();
       if (contactsList.empty()) 
       {
           System.out.println("there is no contact!");
           return;
       }
       //we assume that delete a contact is depend on the contact name
       System.out.println("Enter the contact's name: ");
       contactToDelete.setName(in.nextLine());
       
       contactToDelete = contactsList.remove(contactToDelete);
       if(contactToDelete==null)
       {
           System.out.println("Contact not found!");
           return;
       }
       
       else
       {
           removeContactFromEvents(contactToDelete);
           
       {
           contactToDelete.getEventList().findfirst();
           for (int i=0; i<contactToDelete.getEventList().size;i++)
           {
               Event events = contactToDelete.getEventList().retrieve();
               if ()
           }
           
           }
        }
   
    }
    
    public static void eventSchedule()
    {
        Contact contact = new Contact();
        Event event = new Event();
        
        System.out.println("Enter event title: ");
        event.setTitle(in.nextLine());
        
        System.out.println("Enter event title: ");
        contact.setName(in.nextLine());
        
        if(!contactsList.empty() && contactsList.search(contact)== true)
        {
            System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
            event.setDate(new Date(in.next()));
            
            System.out.println("Enter event location: ");
            event.setLocation(in.nextLine());
            
            contact = contactsList.retrieve();
            
            
            
            
        }
    }  
 
}
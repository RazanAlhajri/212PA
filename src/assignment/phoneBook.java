
package assignment;

import java.util.Scanner;
import java.util.Date;


public class phoneBook {
    public static Scanner in = new Scanner (System.in);
    private LinkedListADT <Contact> contactlist;
    private LinkedListADT<Event> events;

    public phoneBook(){
        contactlist = new LinkedListADT ();
        events = new LinkedListADT();
    }

    
  
    }
    public void addContact (Contact contact){
     Contact newcontact = new Contact();
     System.out.println(" enter the contacts name ");
     newcontact.name = in.nextLine();
        if (!contactlist .empty() && contactlist.search(newcontact))
{
        System.out.println("contact exist");
        return;
}
System.out.println("enter contacts phone number")
newcontact.phoneNumber = in.nextLine();
if (!contactlist.empty()){
contactlist.findfirst();
for(int i = 0 ; i<contactlist.size ; i++){
if (contactlist.retrieve().phoneNumber.compareTo(newcontact.phoneNumber)== 0){
System.out.println("contact exist");
return ;

}
contactlist.findNext();

}




}



}
     public Contact searchcontact ( String criteria , String searchterm){
         Node current = contact.head;
         boolean find = false ; 
         while (cirrent != null){
             Contact contact = current.data;
             if (criteria.equals("Name")&&contact.getName().equalsIgnoreCase(searchterm)){
              System.out.println("contact found!") ;
              find = true ;
              
             
         }
             else if (criteria.equals("phone number")&&contact.getPhoneNumber().equals(searchterm)){
                 
     }
     
         
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author HUAWEI
 */
public class phoneBook {
    private LinkedListADT <Contact> contactlist;
     private LinkedListADT<Event> events;

    public phoneBook(){
        contactlist = new LinkedListADT ();
        events = new LinkedListADT();
    }

    
    public boolean contactexist(String Name , String phoneNumber){
        Node current = contactlist.getHead();
        while (current != null){
            Contact contact = current.getData();
             if(contact.getName().equalsIgnoreCase(Name)||contact.getPhoneNumber().equals(phoneNumber)){
                return true ;
             
            }
            current = current.next;
            
        }
        return false;
        
    }
    public void addContact (Contact contact){
     if (!contactexist(contact.getName(),contact.getPhoneNumber())){
         Node newnode = new Node(contact);
         contact.head = newnode;
         
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

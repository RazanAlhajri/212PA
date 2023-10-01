/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;



/**
 *
 * @author HUAWEI
 */
public class LinkedListADT <T> {
    Node<T> head ; 
    private Node<T> current ;

 public LinkedListADT() {
     head = current = null ;
     
 }
 public boolean empty() {
     return head == null ;
     
 }
 
 public void addContact (Contact contact){
     if (!contactexist(contact.getName(),contact.getPhoneNumber())){
         Node newnode = new Node(contact);
         contact.head = newnode;
         
         
         
     }
     
 }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node<T> current) {
        this.current = current;
    }
 
    
    
    
    
    
}

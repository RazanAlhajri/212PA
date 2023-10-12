package main.java.com.mycompany.pa;
public class LinkedListADT <T extends Comparable<T>>
{     
    private Node<T> head ; 
    private Node<T> current ;
    int size ;

    public LinkedListADT() 
    {
       head = current = null ;
       size = 0 ; 
    }
    public boolean empty() 
    {
       return head == null ;  
    }
    public boolean last()
    {
       return current.next == null ; 
    }

    public boolean full()
    {
       return false ;    
    }
    public void update (T val) 
    {
            current.data = val;
    }
    public T retrieve ()
    {
       return current.data;
    }
    public void findnext()
    {
       current = current.next;
    }
    public  void findfirst()
    {
       current = head ; 
    }
    public void insert (T value)
    {
       if (empty()) 
       {
           current = head = new Node (value);
           current = current.next; 
       }
       size++;
    }

    public boolean sorting (T value )
    {
       Node <T> temp ; 
       if (empty()) 
       {
          current = head = new Node (value);
       }
       else 
       {
          if (head.getData().compareTo(value) > 0)
          {
              temp = new Node (value);
              temp.setNext(head);
              head = temp;   
          }
          else 
          {
              Node<T> previous = null ;
              current = head ;
              while ((current != null)&& (current.getData().compareTo(value) <= 0))
              {
                 previous = current ; 
                 current = current.getNext();
              }
              temp = new Node (value);
              if (current != null )
              {
                 temp.next = current ; 
                 previous.next = temp;
                 current = temp ;     
              }
              else 
                 current = previous.next = temp ;   
           }
       }
       size++; 
       return true;
    }
    
    public boolean search (T value )
    {
     if (head == null)
         return false ; 
     Node<T> node = head ; 
     while (( node != null )&& (node.getData().compareTo(value)!=0))
         node = node.getNext();
     if ((node != null)&&(node.getData().compareTo(value)==0)){
         current = node;
     
     return true ; }
     return false;     
    }
    public T remove (T value )
    {
       if (search (value) == false )
       {
          return null;   
       }
       
       T data = current.getData();
       if (current == head )
       {
          head = head.next;
       }
       else 
       {
          Node temp = head ; 
          while (temp.next != current)
              temp = temp.next;
              temp.next = current.next;
       }
       if (current.next == null)
          current = head ; 
       else 
         current = current.next; 
       
       size-- ; 
       return data ;
    }
     
    public void print() 
    {
         Node Print = head;
         while (Print != null )
         {
            System.out.println(Print.data + " ");
            Print = Print.next;           
         }
         System.out.println("");
    }           
 }
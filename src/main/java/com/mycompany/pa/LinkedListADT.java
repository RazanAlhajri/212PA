package com.mycompany.pa;
public class LinkedListADT <T extends Comparable<T>>
{     
    private Node<T> head ; 
    private Node<T> current ;
    int size ;

    public LinkedListADT() 
    {
       head = current = null ;   
    }
    public boolean empty() 
    {
       return head == null ;
    }
}
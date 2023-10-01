/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author HUAWEI
 */
public class Node<T>{
    public T data;
    public Node<T> next ;
    
    public Node(){
        data=null;
        next = null;
        
    }
public Node (T contact){
    data = contact ;
    next = null ;
    
}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
    
}

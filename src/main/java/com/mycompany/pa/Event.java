package com.mycompany.pa;
import java.util.Date;

public class Event implements Comparable<Event>  
{
   String title;
   Date date;
   String location;
   LinkedListADT <String> ContactNames;

   public Event(String title, Date date, String time, String location, <any> ContactNames) {
        this.title = title;
        this.date = new Date(date);
        this.time = time;
        this.location = location;
        this.ContactNames = new LinkedListADT <String>();
        ContactNames.insertSort(contacts);
        // add sorting() mrthod 
    }

    public Event() {
        title = "";
        date = null;
        time = "";
        location = "";
        this.ContactNames = new LinkedListADT <String>();      
    }


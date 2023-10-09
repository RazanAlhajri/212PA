package com.mycompany.pa;
import java.util.Date;

public class Event implements Comparable<Event> 
{
   String title;
   Date date;
   String location;
   String time;
   LinkedListADT <String> ContactNames;

public Event(String title, Date date, String location, String time, LinkedListADT<String> ContactNames) 
{
   this.title = title;
   this.date = date;
   this.location = location;
   this.time = time;
   this.ContactNames = new LinkedListADT<String>();
}

public Event() 
{
   title = "";
   date = null;
   time = "";
   location = "";
   this.ContactNames = new LinkedListADT <String>(); 
}

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

public void setTitle(String title) 
{
   this.title = title;
}

public void setDate(Date date) 
{
    this.date = date;
}

public void setLocation(String location) 
{
    this.location = location;
}


public int compareTo(Event e)// comparing two event titles 
{ 
   return (this.title.compareToIgnoreCase(e.title));
}

@Override
public String toString() 
{
   String str = "Event: " + "title= " + title + ", date= " + date + ", location= " + location + ", time= " + time;
   int i = 0;
   ContactNames.findfirst();
   while(i < ContactNames.size) 
   {
     str = str + ContactNames.retrieve() + " ";
     i++;
   }
   return str;
}

}// end class




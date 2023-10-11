package main.java.com.mycompany.pa;
import java.util.Date;

public class Event implements Comparable<Event> 
{
   String title;
   Date date;
   String location;
   String time;
   LinkedListADT <Contact> Contacts;

public Event(String title, Date date, String location, String time, LinkedListADT<String> ContactNames) 
{
   this.title = title;
   this.date = date;
   this.location = location;
   this.time = time;
   this.Contacts = new LinkedListADT<Contact>();
}

public Event() 
{
   title = "";
   date = null;
   time = "";
   location = "";
   this.Contacts = new LinkedListADT <Contact>(); 
}

    public Date getDate() {
        return date;
    }

    public String getTime() 
    {
        return time;
    }

    public String getTitle() {
        return title;
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

public boolean removeContactFromEvents(Contact c)
{
    return Contacts.remove(c)!=null;    
}
public boolean addContactToEvent(Contact c)
{
    return Contacts.sorting(c);
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
   Contacts.findfirst();
   while(i < Contacts.size) 
   {
     str = str + Contacts.retrieve() + " ";
     i++;
   }
   return str;
}

}// end class
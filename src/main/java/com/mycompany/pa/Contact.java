package main.java.com.mycompany.pa;

public class Contact implements Comparable <Contact>
{
    private String name ; 
    private String phoneNumber;
    private String emailAddress ;
    private String address ;
    private String birthday ; 
    private String notes ;
    private LinkedListADT<Event> eventList ;

    public Contact() 
    {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress = "";
        this.address = "";
        this.notes = "";
        eventList = new LinkedListADT <Event>();
    }
    
    public Contact(String name, String phoneNumber, String emailAddress, String birthday, String notes) 
    {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.emailAddress = emailAddress;
       this.birthday = birthday;
       this.notes = notes;
       eventList = new LinkedListADT <Event>();
    }

    public String getName() 
    {
        return name;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getBirthday() 
    {
        return birthday;
    }

    public String getNotes() 
    {
        return notes;
    }

    public LinkedListADT<Event> getEventList() 
    {
        return eventList;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    public void setNotes(String notes) 
    {
        this.notes = notes;
    }
    
    public boolean addEvent(Event event)
    {
        if (!eventList.empty())
        {
           eventList.findfirst();
           for (int i=0; i<eventList.size;i++)
           {
               if((eventList.retrieve().getDate().compareTo(event.getDate())== 0)&&(eventList.retrieve().getTime().compareTo(event.getTime())==0))
               {
                   return false;  
               }
           }
        }
        eventList.sorting(event);
        return true;
    }
    
    public boolean delEvent(String title)
    {
        Event eventToDel = new Event();
        eventToDel.setTitle(title);
        
        if(!eventList.empty()&&eventList.remove(eventToDel)!=null)
            return true;
        
        return false;
    }
    
    
    
    @Override
    public int compareTo(Contact another)
    {
       return this.getName().compareTo(another.getName());
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + '}';
    }
    
}


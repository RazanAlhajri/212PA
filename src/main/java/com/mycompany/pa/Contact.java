package com.mycompany.pa;

public class Contact implements Comparable<Contact>
{
    private String name ; 
    private String phoneNumber;
    private String emailAddress ;
    private String address ;
    private String birthday ; 
    private String notes ;

    public Contact() 
    {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress = "";
        this.address = "";
        this.notes = "";
    }
    
    public Contact(String name, String phoneNumber, String emailAddress, String birthday, String notes) 
    {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.emailAddress = emailAddress;
       this.birthday = birthday;
       this.notes = notes;
    }

    public String getName() 
    {
        return name;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNotes() {
        return notes;
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
    
    
    @Override
    public int compareTo(Contact another)
    {
       return this.getName().compareTo(another.getName());
    }
}

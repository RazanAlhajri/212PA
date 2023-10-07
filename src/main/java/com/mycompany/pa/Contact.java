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

    @Override
    public int compareTo(Contact another)
    {
       return this.getName().compareTo(another.getName());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author HUAWEI
 */
public class Contact implements Comparable  {
    private String name ; 
    private String phoneNumber;
     private String emailAddress ; 
      private String birthday ; 
       private String notes ; 
       
      
    public Contact(String name, String phoneNumber, String emailAddress, String birthday, String notes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.birthday = birthday;
        this.notes = notes;
    }

    
    public int compareTo(Contact otherContact) {
        return this.name.compareTo(otherContact.name);
      
    }
  //  public boolean addEvent (Event e){
        
   // }
   // public boolean removeEvent (String title ){
        
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
       
       
       
}

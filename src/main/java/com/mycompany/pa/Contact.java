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

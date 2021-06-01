public class Email {

    //fields
    private String firstName;
    private String lastName;
    private String password;
    private String departament;
    private int defaultPasswordLength;
    private String  email;
    private int MailboxCapacity = 500;
    private String alternateEmail;



//    public String password;

    public Email() {
    }

    public Email(String firstName, String lastName, String email, String password, String departament, int defaultPasswordLength, int mailboxCapacity, String alternateEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.departament = departament;
        this.defaultPasswordLength = defaultPasswordLength;
    }

    public Email(String firstName, String lastName, String password, String departament) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.departament = departament;
    }

    public String getEmail() {
        return email;
    }
    public String showInfo(){
        return ( "DISPLAY NAME : " + firstName +" "+ lastName +"\n"+
                "COMPANY EMAIL: " + email +"\n"+
                "MAILBOX CAPACITY  :" + MailboxCapacity + "mb");
    }


    //change the password
    public void changePassword(String password){
        this.password = password;
    }

    public void setEmail() {
        this.email = firstName.toLowerCase() + "." + lastName +"@"+ departament.toLowerCase()+ ".com";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//
    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getDefaultPasswordLength() {
        return defaultPasswordLength;
    }

    public void setDefaultPasswordLength(int defaultPasswordLength) {
        this.defaultPasswordLength = defaultPasswordLength;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    public int getMailboxCapacity() {
        return MailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.MailboxCapacity = mailboxCapacity;
    }

}



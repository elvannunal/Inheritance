public class Employee {
   private String nameSurname;
   private String phoneNumber;
   private String eMail;

    public Employee(String nameSurname,String phoneNumber,String eMail){
        this.nameSurname=nameSurname;
        this.phoneNumber=phoneNumber;
        this.eMail=eMail;
    }
    public String getNameSurname(){
        return nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname=nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String geteMail(){
        return eMail;
    }
    public void seteMail(String eMail){
        this.eMail=eMail;
    }
    public void login(){
        System.out.println(nameSurname+" entered the university!");
    }
    public void exit(){
        System.out.println(nameSurname+" entered the university!");
    }
    public void diningHall(){
        System.out.println(nameSurname+" entered the university!");
    }
}

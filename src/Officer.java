public class Officer extends Employee{

    private String department;
    private String shift;

    public Officer(String nameSurname,String phoneNumber,String eMail,String department,String shift){
        super(nameSurname,phoneNumber,eMail);
        this.department=department;
        this.shift=shift;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getShift(){
        return shift;
    }
    public void setShift(String shift){
        this.shift=shift;
    }
    public void calis(){
        System.out.println(getDepartment()+" nında çalışır.");
    }
}

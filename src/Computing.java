public class Computing extends Officer{

    private String task;
    public Computing(String nameSurname,String phoneNumber,String eMail,String department,String shift,String task){
        super(nameSurname,phoneNumber,eMail,department,shift);
        this.task=task;
    }
    public String getTask(){
        return task;
    }
    public void setTask(String task){
        this.task=task;
    }
    public void networkKurulumu(){
        System.out.println(getNameSurname()+" task.");
    }
}

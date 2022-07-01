public class SecurityGuard extends Officer{
    private String document;

    public SecurityGuard(String nameSurname,String phoneNumber,String eMail,String department,String shift,String document){
        super(nameSurname,phoneNumber,eMail,department,shift);
        this.document=document;
    }
    public String getDocument(){
        return document;
    }
    public void setDocument(String document) {
        this.document=document;
    }
    public void nobet(){
        System.out.println("Nöbet yapıldı."+document);
    }
}

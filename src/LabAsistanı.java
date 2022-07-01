public class LabAsistanı extends Asistan{

    public LabAsistanı(String nameSurname,String phoneNumber,String eMail,String bolum,String unvan,String ofisSaati){
        super(nameSurname,phoneNumber,eMail,bolum,unvan,ofisSaati);
    }
    public void lablaraGir(){
        System.out.println("Lablara gir "+getNameSurname());
    }
    public void derslereGir(){
        System.out.println("Derslere gir "+getNameSurname());
    }
}

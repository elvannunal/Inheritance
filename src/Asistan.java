public class Asistan extends Academician{
    private String ofisSaati;

    public Asistan(String nameSurname,String phoneNumber,String eMail,String bolum,String unvan,String ofisSaati){
        super(nameSurname,phoneNumber,eMail,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }
    public String getOfisSaati(){
        return ofisSaati;
    }
    public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }
    public void quizYap(){
        System.out.println("Quiz yap "+getNameSurname());
    }
}

public class OgretimGorevlisi extends Academician{
    private String kapiNo;

    public OgretimGorevlisi(String nameSurname,String phoneNumber,String eMail,String bolum,String unvan,String kapiNo){
        super(nameSurname,phoneNumber,eMail,bolum,unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(String kapiNo){
        this.kapiNo=kapiNo;
    }
}

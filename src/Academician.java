public class Academician extends Employee {

   private String bolum;
   private String unvan;
    public Academician(String nameSurname,String phoneNumber,String eMail,String bolum,String unvan){
        super(nameSurname,phoneNumber,eMail);
        this.bolum=bolum;
        this.unvan=unvan;
    }
    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public String getUnvan(){
        return unvan;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }
    //metot oluştururken void(geriye değer döndürmeyen) şeklinde kullanılır.
    public void derseGir(){
        System.out.println(this.getNameSurname()+" derse girdi!");
        //direkt this.namesurnme olarak erişim yapılamıyor ama kapsülleme ile get metodu ile erişim sağlanarak
        //metotda kullanım bu şekilde yapılıyor.
    }
}

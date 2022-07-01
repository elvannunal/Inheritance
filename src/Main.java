public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Elvan Unal","3534543","343");
        System.out.println(e1.getNameSurname());
        Academician e2=new Academician ("elvan","324","3423","Bilgisayar Mühendisliği","doçent");
        System.out.println(e2.getBolum());
        Officer o1=new Officer("Patikadev","324324","2343","Bilgi islem","10-17.00");
        System.out.println(o1.getDepartment());
        Computing c1=new Computing("elvan","39483","485937","Bilgi islem","10.00-18.00","network kurulumu");
        System.out.println(c1.getTask());
        LabAsistanı la1=new LabAsistanı("elvan","33","454","Bilgisayar Mühensiliği","lab asistani","12.00");
        la1.derslereGir();
    }
}

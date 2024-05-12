package ex_22042024;

public class LabHW24 {
    public static void main(String[] args) {
        System.out.println("First student :");
        Student stu = new Student();
        stu.name = "Prasanth";
        System.out.println("Name of the student is "+stu.name);
        Course cor = new Course();
        cor.name="Java";
        System.out.println("Course enrolled for "+cor.name);
        Payment pay = new Payment();
        pay.money = "Rs900";
        System.out.println("Total amount paid " +pay.money);
        pay.creditCard();
        Course crdate = new Course();
        crdate.start();
        System.out.println("Start date is "+crdate.start());
        crdate.end();
        System.out.println("Start date is "+ crdate.end());
        System.out.println(" ");
        System.out.println("Second student :");
        Student stu1 = new Student();
        stu1.name = "Radha";
        System.out.println("Name of the student is "+stu1.name);
        Course cor1 = new Course();
        cor1.name="Python";
        System.out.println("Course enrolled for "+cor1.name);
        Payment pay1 = new Payment();
        pay1.money = "Rs1900";
        System.out.println("Total amount paid " +pay1.money);
        pay1.googlePay();
        Course crdate1= new Course();
        crdate1.start();
        System.out.println("Start date is "+crdate1.start());
        crdate1.end();
        System.out.println("Start date is "+ crdate1.end());
        System.out.println(" ");
        System.out.println("Third student :");
        Student stu2 = new Student();
        stu2.name = "Santhi";
        System.out.println("Name of the student is "+stu2.name);
        Course cor2= new Course();
        cor2.name="SQL";
        System.out.println("Course enrolled for "+cor2.name);
        Payment pay2 = new Payment();
        pay2.money = "Rs200";
        System.out.println("Total amount paid " +pay2.money);
        pay2.paypal();
        Course crdate2= new Course();
        crdate2.start();
        System.out.println("Start date is "+crdate2.start());
        crdate2.end();
        System.out.println("Start date is "+ crdate2.end());
    }
}

package Wraper;

public class Lab33 {
    public static void main(String[] args) {
        Day d1 = Day.Friday;
        System.out.println(d1);

        for(Size size : Size.values()){
            System.out.println("Size is " +size+  " Abbrivation  is "  +size.getSize() );

        }
    }

}
    enum Day{
     Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
            }
    enum Size{
     SMALL("s"),MEDIUM("m"),LARGE("l");
     private String size;

        Size(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }
    }

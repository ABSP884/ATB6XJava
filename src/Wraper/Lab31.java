package Wraper;

public class Lab31 {

}
class PersonATB{
    String name;
    Integer rollnum;
    Long phonenumber;

    public PersonATB(String name, Integer rollnum, Long phonenumber) {
        this.name = name;
        this.rollnum = rollnum;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollnum() {
        return rollnum;
    }

    public void setRollnum(Integer rollnum) {
        this.rollnum = rollnum;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
}


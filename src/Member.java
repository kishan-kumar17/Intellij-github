public class Member {

    private int id ;
    private String name;
    private double gpa;
    public Member(int id, String name, double gpa){
       this.id = id;
        this.name = name;
        this.gpa = gpa;
        System.out.println(" constructing :" + id + " this : " + this);
    }
    public void printStudentInfo(){
        System.out.println();
        System.out.println("ID :" + id + " \nname :" + name + "\ngpa:" + gpa);
        System.out.println("using 'this' key word");
        System.out.println("Id:" + this.id + "Name:" + this.name + "Gpa" + this.gpa);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGpa(double gpa){
        this.gpa= gpa;
    }
}

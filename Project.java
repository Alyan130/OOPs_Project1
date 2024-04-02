class Info{
    String name;
    String location;
public Info(String name,String location){
    this.name=name;
    this.location=location;
}

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void display(){
    System.out.println("Name : "+getName());
    System.out.println("Location : "+getLocation());
}
}
class Departments extends Info{
    int no_of_departments;
    public Departments(String name,String location,int no_of_departments){
        super(name,location);
        this.no_of_departments=no_of_departments;
    }

    public int getNo_of_departments() {
        return no_of_departments;
    }

    public void display(){
        super.display();
        System.out.println("Total departments : "+getNo_of_departments());
    }
}
class topDepartments extends Departments{
    String dept1;
    String dept2;
    String dept3;
    public topDepartments(String name,String location, int no_of_departments,String dept1,String dept2,String dept3) {
        super(name, location, no_of_departments);
        this.dept1 = dept1;
        this.dept2 = dept2;
        this.dept3 = dept3;
    }

    public String getDept1() {
        return dept1;
    }

    public String getDept2() {
        return dept2;
    }

    public String getDept3() {
        return dept3;
    }

    public void display(){
       super.display();
        System.out.println("Top Departments");
        System.out.println("Department 1 : "+getDept1());
        System.out.println("Department 2 : "+getDept2());
        System.out.println("Department 3 : "+getDept3());
    }
}
class Approved extends topDepartments{
    String PEC;
    String HEC;
    public Approved(String name,String location, int no_of_departments,String dept1,String dept2,String dept3,String PEC,String HEC){
     super(name,location,no_of_departments,dept1,dept2,dept3);
     this.PEC=PEC;
     this.HEC=HEC;
    }

    public String getPEC() {
        return PEC;
    }

    public String getHEC() {
        return HEC;
    }

    public void display(){
        super.display();
        System.out.println("PEC approved : "+getPEC());
        System.out.println("HEC approved : "+getHEC());
    }
}
class University extends Approved {
    public University(String name, String location, int no_of_departments, String dept1, String dept2, String dept3, String PEC, String HEC) {
        super(name, location, no_of_departments, dept1, dept2, dept3, PEC, HEC);
    }
    public void display() {
        System.out.println("UNIVERSITY DETAILS");
        super.display();
        System.out.println();
    }
    }
    public class Project{
        public static void main(String[] args) {
            University u1 = new University("Dawood University", "Karachi", 18, "Chemical Engineering", "Industrial Engineering", "Petroleum Engineering", "yes", "Yes");
            University u3= new University("Nust University","Islamabad",31,"Computer Science","Chemical Engineering","Electornic Engineering","yes","yes") ;
            University u2 = new University("Ned University", "Karachi", 26, "Software Engineering", "Electrical Engineering", "Mechincal Engineering", "yes", "yes");
           u1.display();
           u2.display();
           u3.display();
        }
    }
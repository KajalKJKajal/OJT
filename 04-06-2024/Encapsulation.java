class Employee{
    private String name;
    private int age;
    public void setName(String newName){
        name=newName;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void ageinc(){
        age++;
    }
    public void agedec(){
        age--;
    }
    public int getAge()
    {
        return age;
    }
 
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("ANU");
        emp.setAge(23);
        emp.ageinc();
        emp.agedec();
        
        System.out.println( emp.getName());
        System.out.println( emp.getAge());
        System.out.println();
    }
    
}

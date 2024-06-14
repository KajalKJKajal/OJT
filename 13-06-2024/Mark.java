public class Mark {
    private String name;
    private int age;
    private String grade;

    public Mark(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Mark student1 = new Mark("Aparna", 21, "A");
        System.out.println(student1.getName());  
        System.out.println(student1.getAge());    
        System.out.println(student1.getGrade());  
    }
}

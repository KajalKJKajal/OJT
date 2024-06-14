public class Student {
    private String name;
    private String studentId;
    private int grade;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 100) {
            this.grade = grade;
        } else {
           System.out.print("Grade must be between 0 and 100");
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anu");
        student.setStudentId("1001");
        student.setGrade(55);
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Grade: " + student.getGrade());

        
    }
}

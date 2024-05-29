class Student {
    private String studentId;
    private String name;
    private int age;
    private double grades;

    public Student(String studentId, String name, int age, double grades) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public void updateGrades(double grades) {
        this.grades = grades;
    }
    
    public void displayStudentInfo() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Grades: " + grades);
    }

    public static void main(String[] args) {
        Student student1 = new Student("01", "Kajal", 23, 88.5);
        Student student2 = new Student("02", "Kaju", 22, 92.0);

        student1.displayStudentInfo();
        student2.displayStudentInfo();

        student1.updateGrades(91.0);
        student1.displayStudentInfo();
    }
}

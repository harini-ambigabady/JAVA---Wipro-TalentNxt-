import java.util.Vector;

class StudentDB {
    private Vector<Student> studentList;

    // Constructor
    public StudentDB() {
        studentList = new Vector<>();
    }

    // Method to add a student
    public boolean addStudent(Student student) {
        return studentList.add(student);
    }

    // Method to remove a student by studentId
    public boolean removeStudent(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return studentList.remove(student);
            }
        }
        return false;
    }

    // Method to display the report card of a student
    public String showReportCard(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return "Report Card for Student ID " + studentId + ": " + student.getGrade();
            }
        }
        return "Student not found.";
    }

    // Method to print all students
    public void printAllStudents() {
        for (Student student : studentList) {
            student.displayStudentDetails();
        }
    }
}

class Student {
    private int studentId;
    private String name;
    private String course;
    private float grade;

    // Constructor
    public Student(int studentId, String name, String course, float grade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    // Method to print student details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
    }
}
public class VEctor {
    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();  

        // Adding students
        Student student1 = new Student(1, "John Doe", "Mathematics", 85.5f);
        Student student2 = new Student(2, "Jane Smith", "Physics", 90.0f);
        studentDB.addStudent(student1);
        studentDB.addStudent(student2);

        // Printing all students
        System.out.println("All Students:");
        studentDB.printAllStudents();

        // Showing report card
        System.out.println(studentDB.showReportCard(1));

        // Removing a student
        System.out.println("Removing Student with ID 1: " + studentDB.removeStudent(1));

        // Printing all students after removal
        System.out.println("All Students after removal:");
        studentDB.printAllStudents();
    }
}

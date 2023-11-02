package prog2Amain;

import prog2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Shelila");
        student.getGradeReport().setGrade("A+");
        System.out.println(student);
    }
}

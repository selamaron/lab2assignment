package prog2A;
public class GradeReport {
    private String grade;
    private Student student;
    GradeReport(Student student){
        this.student = student;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }

}

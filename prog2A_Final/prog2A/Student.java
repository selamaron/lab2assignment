package prog2A;

public class Student {
    private String name;
    private GradeReport gradeReport;
    public Student(String name){
        this.name = name;
         gradeReport = new GradeReport(this);
    }
    public String getName(){
        return name;
    }
    public void setGradeReport(GradeReport gradeReport){
        this.gradeReport = gradeReport;
    }
    public GradeReport getGradeReport(){
        return gradeReport;
    }
    public String toString(){
        return "Name: " + name + "\nGrade: " + this.gradeReport.getGrade();
    }
}

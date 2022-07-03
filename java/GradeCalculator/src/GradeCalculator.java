import java.util.ArrayList;

public class GradeCalculator {
    public String name;
    public double grade, nowGrade, sumGrade, fullCredit, nowFullCredit;
    public ArrayList<Course> courseArray = new ArrayList<>();
    public int credit, nowCredit;

    public GradeCalculator(String name, double grade, int credit) {
        this.name = name;
        this.grade = grade;
        this.credit = credit;
        this.fullCredit = grade * credit;
        this.sumGrade = grade;
    }

    public void addCourse(Course course) {
        courseArray.add(course);
        nowCredit += course.credit;
        nowFullCredit += course.grade * course.credit;
        nowGrade = nowFullCredit / nowCredit;
        sumGrade = (fullCredit + nowFullCredit) / (credit + nowCredit);
    }

    public void print() {
        System.out.println("직전 학기 성적: "+ grade +" (총 " + credit + "학점)");
        System.out.println("이번 학기 성적: "+ String.format("%.10f", nowGrade) +" (총 " + nowCredit + "학점)");
        System.out.println("전체 예상 학점: "+ String.format("%.10f", sumGrade) +" (총 " + (credit+nowCredit) + "학점)");
    }

}
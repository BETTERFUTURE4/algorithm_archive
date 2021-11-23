import java.util.HashMap;

public class Course {
    public String name;
    public  int credit;
    public double grade;
    public static final HashMap<String, Double> gradeDictionary
            = new HashMap<String, Double>() {{
        put("A+",4.5);
        put("A",4.0);
        put("B+",3.5);
        put("B",3.0);
        put("C+",2.5);
        put("C",2.0);
        put("D+",1.5);
        put("D",1.0);
        put("F",0.0);
    }};
    public static final int CREDIT_MAJOR = 3;
    public static final int CREDIT_GENERAL = 2;
    public Course(String name, int credit , String gradeStr) {
        this.name = name;
        this.grade = gradeDictionary.get(gradeStr);
        this.credit = credit;

    }

}

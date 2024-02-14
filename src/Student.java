

public class Student {
    private String name;
    private String prn;
    private String dob;
    private int marks;

    public Student(String name, String prn, String dob, int marks){
        this.name = name;
        this.prn = prn;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

}
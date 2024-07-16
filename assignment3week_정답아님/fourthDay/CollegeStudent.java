package assignment3week_정답아님.fourthDay;

import java.util.ArrayList;
import java.util.List;

public abstract class CollegeStudent<T> {

    protected String studentID;
    protected String studentName;
    protected double creditPoint;
    protected List<T> students = new ArrayList<>();

    public CollegeStudent(String studentID, String studentName, double creditPoint) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.creditPoint = creditPoint;

    }

    public CollegeStudent() {

    }

    public abstract void addStudent(T student);


    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return studentName;
    }
}

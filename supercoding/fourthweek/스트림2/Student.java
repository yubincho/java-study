package supercoding.fourthweek.스트림2;

public class Student {

    private int schoolYear;
    private int classroomNumber;
    private int studentNumber;


    private String name;
    private String gender;
    private int score;

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getSchoolYaer() {
        return schoolYear;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getScore() {
        return score;
    }

    public void setSchoolYaer(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolYaer=" + schoolYear +
                ", classroomNumber=" + classroomNumber +
                ", studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}

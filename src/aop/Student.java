package aop;

import java.util.Objects;

public class Student {
    private String nameSurname;
    private int course;
    private double doubleAvgGrade;

    public Student(String nameSurname, int course, double doubleAvgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.doubleAvgGrade = doubleAvgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getDoubleAvgGrade() {
        return doubleAvgGrade;
    }

    public void setDoubleAvgGrade(double doubleAvgGrade) {
        this.doubleAvgGrade = doubleAvgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", doubleavgGrade=" + doubleAvgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Double.compare(student.doubleAvgGrade, doubleAvgGrade) == 0 && Objects.equals(nameSurname, student.nameSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, course, doubleAvgGrade);
    }
}

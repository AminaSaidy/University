package uzb.aminasaidakhmedova.university.entity;

import uzb.aminasaidakhmedova.university.util.Actions;
import uzb.aminasaidakhmedova.university.util.StudentActions;

public class Student implements Actions, StudentActions {

    private String fullName;
    private String major;
    private University university;


    public Student(String fullName, String major, University university) {
        this.fullName = fullName;
        this.major = major;
        this.university = university;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void getIdCard() {
        System.out.println("I am " + fullName + " and I need to get an ID card to enter university.");
    }

    @Override
    public void studyMajor() {
        System.out.println("I study " + major + " at " + university.getName() + ".");
    }

}

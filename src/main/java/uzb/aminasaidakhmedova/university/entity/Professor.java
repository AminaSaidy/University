package uzb.aminasaidakhmedova.university.entity;

import uzb.aminasaidakhmedova.university.util.Actions;
import uzb.aminasaidakhmedova.university.util.ProfActions;

public class Professor implements Actions, ProfActions {

    private String fullName;
    private String subject;
    private int roomNumber;
    private University university;

    public Professor(String fullName, String subject, int roomNumber, University university) {
        this.fullName = fullName;
        this.subject = subject;
        this.roomNumber = roomNumber;
        this.university = university;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void getIdCard() {
        System.out.println("I am Dr." + fullName + ", and I need to get an ID card to enter university.");
    }

    @Override
    public void getRoomKeys() {
        System.out.println("I requested keys for my room number " + roomNumber + ".");
    }

    @Override
    public void teachSubject() {
        System.out.println("I teach " + subject + " at " + university.getName() + ".");
    }
}

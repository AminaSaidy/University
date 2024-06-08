package uzb.aminasaidakhmedova.university._main;

import uzb.aminasaidakhmedova.university.entity.Professor;
import uzb.aminasaidakhmedova.university.entity.Student;
import uzb.aminasaidakhmedova.university.entity.University;

public class _Main {
    public static void main(String[] args) {
        University university = new University("Galaxy university");
        Professor prof1 = new Professor("Jack Jackson", "Philosophy", 304, university);
        Student stud1 = new Student("Amina Saidy", "Software Engineering", university);

        stud1.getIdCard();
        stud1.studyMajor();

        System.out.println("");

        prof1.getIdCard();
        prof1.teachSubject();
        prof1.getRoomKeys();

    }

}

package p2;

import p1.Admitere;
import p1.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setMedieAdmitere(9.2);
        student2.setMedieAdmitere(4.25);
        student3.setMedieAdmitere(9.99);
        student4.setMedieAdmitere(6.25);
        student5.setMedieAdmitere(4.25);

        Admitere.acceptaStudent(student1);
        Admitere.acceptaStudent(student2);
        Admitere.acceptaStudent(student3);
        Admitere.acceptaStudent(student4);
        Admitere.acceptaStudent(student5);

    }
}

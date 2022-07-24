package p1;

public class Admitere {

    static private double ultimaMedie = 7.8;
    static private int locuriTotale = 150;
    static private int locuriOcupate = 148;



    public static double getUltimaMedie() {
        return ultimaMedie;
    }

    public static void setUltimaMedie(double ultimaMedie) {
        Admitere.ultimaMedie = ultimaMedie;
    }

    public static int getLocuriTotale() {
        return locuriTotale;
    }

    public static void setLocuriTotale(int locuriTotale) {
        Admitere.locuriTotale = locuriTotale;
    }

    public static int getLocuriOcupate() {
        return locuriOcupate;
    }

    public static void setLocuriOcupate(int locuriOcupate) {
        Admitere.locuriOcupate = locuriOcupate;
    }

    public static boolean acceptaStudent(Student student){

        if (locuriOcupate == locuriTotale){
            System.out.printf("Toate locurile au fost ocupate.");
            return false;
        } else if (student.getMedieAdmitere() > getUltimaMedie()) {
            Admitere.locuriOcupate++;
            System.out.println("Studentul " + student.getNume() + " a fost admis cu media " + student.getMedieAdmitere() +" la facultatea " + student.getFacultate());
            System.out.println(" ");
            return true;
        }
        System.out.println("Studentul " + student.getNume() + " NU a fost admis");
        return false;
    }
}

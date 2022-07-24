package p1;

public class Student {

    final private String nume = "Bobonete";
    private String facultate = "UPG";
    private double medieAdmitere = 8.45;

    public String getNume() {
        return nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }

    public void setFacultate(String facultate) {
        if (this.facultate.length() <3){
            this.facultate = "MAI";
            System.out.println("Facutlatea introdusa contine un numar mai mic de 3 litere. O sa atribuim o valoare default: " + this.facultate);
        }else{
            this.facultate = facultate;
        }
    }

    public void setMedieAdmitere(double medieAdmitere) {
        if (medieAdmitere<1 || medieAdmitere>10 ){
            this.medieAdmitere = 1;
            System.out.println("Media de admitere introdusa nu se afla in intervalul 1-10. O sa atribuim o valoare default: " +this.medieAdmitere);
        }else{
            this.medieAdmitere = medieAdmitere;
        }
    }
}

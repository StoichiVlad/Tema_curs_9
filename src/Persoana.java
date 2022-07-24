public class Persoana {

     String nume;
     int varsta;

    public Persoana(String numeNou, int varstaNoua){
        this.nume = numeNou;
        this.varsta = varstaNoua;
    }

    public void afiseazaInformatii(){
        System.out.println("Numele persoanei este " + nume + " si are varsta de " + varsta + " ani.");
    }
}

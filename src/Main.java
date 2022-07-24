public class Main {
    static int numarint  = 10;
    public static void atribuieInversul(int numar){
        numarint = -numar;

    }
    static void cresteVarsta(Persoana persoana){
        persoana.varsta++;

    }

    public static void main(String[] args) {
        Persoana persoana = new Persoana("Robert" , 30);
        Persoana persoana1 = new Persoana("Mihai" , 20);

        persoana.afiseazaInformatii();
        persoana1.afiseazaInformatii();

        Persoana persoana2 = persoana;

        persoana2.afiseazaInformatii();

        System.out.println(" ");

        System.out.println("Numarul introdus este: " + numarint);
        atribuieInversul(numarint);
        System.out.println(numarint);

        System.out.println(" ");

        System.out.println("Varsta persoanei 1 este: " +  persoana.varsta);
        cresteVarsta(persoana);
        System.out.println("Varsta persoanei 1 dupa incrementare este: " + persoana.varsta);

        System.out.println(" ");
        System.out.println("Varsta persoanei 3 este: " + persoana2.varsta);













    }


}

import java.util.Scanner;

abstract class Persona {
    private String nome;
    private String cognome;
    // protected serve per  farsì che questa variabile venga vista dalle classi figlie
    protected int annoDiNascita;

    Scanner scannerNumero = new Scanner(System.in);
    Scanner scannerTesto = new Scanner(System.in);

    public String getNome() {
        return this.nome;
    }

  // nome.matches(".*\\d.*") serve per verificare la presenza di numeri all'interno del nome
    public void setNome(String nome) {
        boolean ripeti = true;
        do {
            if (nome.matches(".*\\d.*")) {
                System.out.println("Dato non corretto");
                System.out.println("Nei nomi non può essere presente un numero");
                nome = scannerTesto.nextLine().trim();
            } else {
                this.nome = nome;
                ripeti = false;
            }
        } while (ripeti);
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        boolean ripeti = true;
        do {
            if (cognome.matches(".*\\d.*")) {
                System.out.println("Dato non corretto");
                System.out.println("Nei cognomi non può essere presente un numero");
                cognome = scannerTesto.nextLine().trim();
            } else {
                this.cognome = cognome;
                ripeti = false;
            }
        } while (ripeti);
    }

    public abstract int getAnnoDiNascita();

    //  Filtra Docenti nati => 1964 && <= 1994 , Studenti nati <= 2018
    public abstract void setAnnoDiNascita(int annoDiNascita);
}

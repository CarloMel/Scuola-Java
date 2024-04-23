import java.util.Scanner;

public class Studente extends Persona implements Palestra {
    private int classe;
    private char sezione;
    private String matricola;

    Scanner scannerNumero = new Scanner(System.in);
    Scanner scannerTesto = new Scanner(System.in);
    
    @Override
    public void setAnnoDiNascita(int annoDiNascita) {

        boolean ripeti = true;
        do {
            // è una scuola molto inclusiva, accetta anche centenni
            if(annoDiNascita >= 1918 && annoDiNascita <= 2018 ) {
                this.annoDiNascita = annoDiNascita;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Si accettano solo studenti nati tra il 1918 e il 2018");
                annoDiNascita = scannerNumero.nextInt();
            }
        } while (ripeti);
    }

    @Override
    public int getAnnoDiNascita() {
        return annoDiNascita;
    }
    
    public int getClasse() {
        return classe;
    }


    public void setClasse(int classe) {
        boolean ripeti = true;
        do {
            if(classe >= 1 &&  classe <= 5) {
                this.classe = classe;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Le classi vanno da 1 a 5");
                classe = scannerNumero.nextInt();
            }
        } while (ripeti);
    }


    public char getSezione() {
        return sezione;
    }


    public void setSezione(char sezione) {
        boolean ripeti = true;
        do {
            // uso il metodo isLetter() della classe Character per verificare se la variabile "sezione" sia una lettera e non un numero
            if(Character.isLetter(sezione)) {
                this.sezione = sezione;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Le sezioni non devono essere numeri");
                sezione = scannerTesto.nextLine().toUpperCase().charAt(0);
            }
        } while (ripeti);
    }


    public String getMatricola() {
        return matricola;
    }


    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}

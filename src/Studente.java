import java.util.Scanner;

public class Studente extends Persona {
    private int classe;
    private char sezione;
    private String matricola;

    Scanner scannerNumero = new Scanner(System.in);
    
    @Override
    public void setAnnoDiNascita(int annoDiNascita) {

        boolean ripeti = true;
        do {
            if(annoDiNascita >= 2000 && annoDiNascita <= 2018 ) {
                this.annoDiNascita = annoDiNascita;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Si accettano solo studenti nati tra il 2000 e il 2018");
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
        this.classe = classe;
    }


    public char getSezione() {
        return sezione;
    }


    public void setSezione(char sezione) {
        this.sezione = sezione;
    }


    public String getMatricola() {
        return matricola;
    }


    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}

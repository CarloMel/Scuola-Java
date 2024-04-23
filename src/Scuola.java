
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scuola {
    Scanner scannerInt = new Scanner(System.in);
    List<Studente> studenti = new ArrayList<Studente>();
    //ArrayList<Docente> docenti = new ArrayList<Docente>();
    //ArrayList<MembroClub> membriClub = new ArrayList<MembroClub>();

    public void aggiungiStudente() {     
        Studente studente1 = new Studente();

        studente1.setNome("Mario");
        studente1.setCognome("Rossi");
        studente1.setAnnoDiNascita(2018);
        studente1.setClasse(1);
        studente1.setSezione("A");

        studenti.add(studente1);

        Studente studente2 = new Studente();

        studente2.setNome("Luigi");
        studente2.setCognome("Verdi");
        studente2.setAnnoDiNascita(2015);
        studente2.setClasse(2);
        studente2.setSezione("B");

        studenti.add(studente2);
    }

    public void stampaStudenti() {
        // i mi serve per tenere traccia della posizione all'interno dell'ArrayList
        // scriverò (i - 1) altrimenti ignorerebbe il primo elemento dell'ArrayList
        int i = 0;
        System.out.println("Nella scuola ci sono in totale " + studenti.size() + " studenti\n");
        for (int j = 0; j < studenti.size(); j++) {
        i++;

        /*
        Questo blocco di codice mi permette di costruire la matricola seguendo le istruzioni della traccia.
        -Do un valore alla matricola utilizzando la variabile i
        -String.format("%03d", i) permette di vedere un numero a tre cifre invece che una sola: 001 invece di 1
        - levo (i - i) perché voglio0 che il numero progressivo parta da 001
        -Anno di nascita % 100 mi dà gli ultimi due numeri della data di nascita
        */
        studenti.get(i - 1).setMatricola((studenti.get(i - 1).getAnnoDiNascita() % 100)
        + String.format("%03d", i) + studenti.get(i-1).getSezione());

        System.out.println
        ("Studente numero " + i + ":\n"
        + "Nome: " + studenti.get(i - 1).getNome() + "\n"
        + "Cognome: " + studenti.get(i - 1).getCognome() + "\n"
        + "Anno di Nascita: " + studenti.get(i - 1).getAnnoDiNascita() + "\n"
        + "Classe: " + studenti.get(i - 1).getClasse() + "\n"
        + "Sezione: " + studenti.get(i - 1).getSezione() + "\n"
        + "Matricola: " + studenti.get(i - 1).getMatricola() + "\n");
        }
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scuola {
    Scanner scannerNumero = new Scanner(System.in);
    Scanner scannerTesto = new Scanner(System.in);
    List<Studente> studenti = new ArrayList<Studente>();
    //ArrayList<Docente> docenti = new ArrayList<Docente>();
    //ArrayList<MembroClub> membriClub = new ArrayList<MembroClub>();

    public void aggiungiStudenti() {
        // creo i per tenere traccia dello studente al quale aggiungere i dati nell'ArrayList
        int i = 0;
        boolean ripeti = true;
        // prima aggiungo uno studente, poi gli do le info
        studenti.add(new Studente());
        do {
            System.out.println("Studente numero " + (i + 1) + "\n");
            System.out.println("Inserisci il nome dello studente: ");
            // trim() rimuove spazi inutilizzati
            studenti.get(i).setNome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci il cognome dello studente: ");
            studenti.get(i).setCognome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci la data di nascita dello studente: ");
            studenti.get(i).setAnnoDiNascita(scannerNumero.nextInt());
            System.out.println("Inserisci classe dello studente: ");
            studenti.get(i).setClasse(scannerNumero.nextInt());
            System.out.println("Inserisci la sezione dello studente: ");
            studenti.get(i).setSezione(scannerTesto.nextLine().trim());

            System.out.println("Tutti i dati sono stati correttamente inseriti");
            System.out.println("Vuoi inserire un altro studente? S/N");
            char conferma = scannerTesto.nextLine().toUpperCase().charAt(0);

            if (conferma == 'S') {
                studenti.add(new Studente());
                // ripeti resta true
                // aumento i per tenere conto della posizione del nuovo studente nell'ArrayList
                i++;
            } else {
                ripeti = false;
            }

        } while (ripeti);
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

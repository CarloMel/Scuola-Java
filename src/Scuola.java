
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scuola {
    Scanner scannerNumero = new Scanner(System.in);
    Scanner scannerTesto = new Scanner(System.in);
    List<Studente> studenti = new ArrayList<Studente>();
    List<Docente> docenti = new ArrayList<Docente>();
    List<IscrittoClub> iscrittiClub = new ArrayList<IscrittoClub>();

    public void aggiungiStudente() {
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
            studenti.get(i).setSezione(scannerTesto.nextLine().toUpperCase().charAt(0));
            System.out.println("Inserisci l'anno del certificato Medico dello studente: ");
            studenti.get(i).setAnnoCertificato(scannerNumero.nextInt());
            System.out.println("Inserisci il cognome del Medico che ha firmato il certificato dello studente: ");
            studenti.get(i).setCognomeMedico(scannerTesto.nextLine().trim());

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

    public void aggiungiProfessore () {
        int i = 0;
        boolean ripeti = true;
        docenti.add(new Docente());
        do {
            System.out.println("Docente numero " + (i + 1) + "\n");
            System.out.println("Inserisci il nome del docente: ");
            docenti.get(i).setNome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci il cognome del docente: ");
            docenti.get(i).setCognome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci la data di nascita del docente: ");
            docenti.get(i).setAnnoDiNascita(scannerNumero.nextInt());
            System.out.println("Inserisci la materia insegnata dal docente: ");
            docenti.get(i).setMateria(scannerTesto.nextLine());

            System.out.println("Tutti i dati sono stati correttamente inseriti");
            System.out.println("Vuoi inserire un altro docente? S/N");
            char conferma = scannerTesto.nextLine().toUpperCase().charAt(0);

            if (conferma == 'S') {
                docenti.add(new Docente());
                i++;
            } else {
                ripeti = false;
            }

        } while (ripeti);
    }
    public void aggiungiIscrittoClub() {

        int i = 0;
        boolean ripeti = true;

        iscrittiClub.add(new IscrittoClub());
        do {
            System.out.println("Iscritto numero " + (i + 1) + "\n");
            System.out.println("Inserisci il nome del membro del club: ");
            // trim() rimuove spazi inutilizzati
            iscrittiClub.get(i).setNome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci il cognome del membro del club: ");
            iscrittiClub.get(i).setCognome(scannerTesto.nextLine().trim());
            System.out.println("Inserisci l'anno del certificato Medico del membro del club: ");
            iscrittiClub.get(i).setAnnoCertificato(scannerNumero.nextInt());
            System.out.println("Inserisci il cognome del Medico che ha firmato il certificato del membro del club: ");
            iscrittiClub.get(i).setCognomeMedico(scannerTesto.nextLine().trim());
            System.out.println("Tutti i dati sono stati correttamente inseriti");

            System.out.println("Vuoi inserire un altro membro del club? S/N");
            char conferma = scannerTesto.nextLine().toUpperCase().charAt(0);

            if (conferma == 'S') {
                iscrittiClub.add(new IscrittoClub());
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
        + "Matricola: " + studenti.get(i - 1).getMatricola() + "\n"
        + "Anno del rilascio certificato medico: " + studenti.get(i - 1).getAnnoCertificato() + "\n"
        + "Cognome del Medico che lo ha rilasciato: " + studenti.get(i - 1).getCognomeMedico() + "\n");
        }
    }
    public void stampaProfessori() {
        int i = 0;
        System.out.println("Nella scuola ci sono in totale " + docenti.size() + " professori\n");
        for (int j = 0; j < docenti.size(); j++) {
        i++;

        System.out.println
        ("Studente numero " + i + ":\n"
        + "Nome: " + docenti.get(i - 1).getNome() + "\n"
        + "Cognome: " + docenti.get(i - 1).getCognome() + "\n"
        + "Anno di Nascita: " + docenti.get(i - 1).getAnnoDiNascita() + "\n"
        + "Materia: " + docenti.get(i - 1).getMateria() + "\n");
        }
    }

    public void stampaIscrittiClub() {

        int i = 0;
        System.out.println("Nella palestra ci sono in totale " + iscrittiClub.size() + " iscritti\n");
        for (int j = 0; j < iscrittiClub.size(); j++) {
        i++;

        System.out.println
        ("Iscritto numero " + i + ":\n"
        + "Nome: " + iscrittiClub.get(i - 1).getNome() + "\n"
        + "Cognome: " + iscrittiClub.get(i - 1).getCognome() + "\n"
        + "Anno del rilascio certificato medico: " + iscrittiClub.get(i - 1).getAnnoCertificato() + "\n"
        + "Cognome del Medico che lo ha rilasciato: " + iscrittiClub.get(i - 1).getCognomeMedico() + "\n");
        }
    }

    public void start() {
        System.out.println("Seleziona quale operazione vuoi eseguire");
        int index = 0;
        
        switch (index) {
            case 1:
            // codice
            break;
        }
    }
}


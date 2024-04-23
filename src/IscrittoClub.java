import java.util.Scanner;

public class IscrittoClub implements Palestra {
    private String nome;
    private String cognome;
    private int annoCertificato;
    private String cognomeMedico;

    Scanner scannerNumero = new Scanner(System.in);
    Scanner scannerTesto = new Scanner(System.in);

    public String getNome() {
        return nome;
    }
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
        return cognome;
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

    @Override
    public void setAnnoCertificato(int annoCertificato) {
        boolean ripeti = true;
        do {
            // il certificato dura 5 anni
            if ( annoCertificato >= 2019 && annoCertificato <= 2024) {
                this.annoCertificato = annoCertificato;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Il certificato medico può essere stato rilasciato soltanto tra il 2019 e l'anno corrente (2024)");
                annoCertificato = scannerNumero.nextInt();
            }            
        } while (ripeti);

    }
    @Override
    public int getAnnoCertificato() {
        return this.annoCertificato;
    }
    @Override
    public void setCognomeMedico(String cognomeMedico) {
        boolean ripeti = true;
        do {
            if (cognomeMedico.matches(".*\\d.*")) {
                System.out.println("Dato non corretto");
                System.out.println("Nei cognomi non può essere presente un numero");
                cognomeMedico = scannerTesto.nextLine().trim();
            } else {
                this.cognomeMedico = cognomeMedico;
                ripeti = false;
            }
        } while (ripeti);
    }
    @Override
    public String getCognomeMedico() {
        return this.cognomeMedico;
    }
}

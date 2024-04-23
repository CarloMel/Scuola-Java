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
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public void setAnnoCertificato(int annoCertificato) {
        boolean ripeti = true;
        do {
            // il certificato dura 5 anni
            if ( annoCertificato >= 2024 && annoCertificato <= 2019) {
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

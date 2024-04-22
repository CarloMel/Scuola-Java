
public class Studente extends Persona {
    private int classe;
    private String sezione;
    private int numeroProgressivo = 0;
    private String matricola;
    // ***this.annoDiNascita = annoDiNascita !! super.annoDiNascita = annoDiNascita NON FUNZIONANO. Le date restano 0***
    @Override
    public void setAnnoDiNascita(int annoDiNascita) {

        if(annoDiNascita > 2018){
            System.out.println("Si accettano solo studenti nati prima del 2018 (2018 compreso)");
        }
        System.out.println("Anno di nascita inserito correttamente ");
        System.out.println("Hai inserito: " + getAnnoDiNascita());


    }
    
    public int getClasse() {
        return classe;
    }


    public void setClasse(int classe) {
        this.classe = classe;
    }


    public String getSezione() {
        return sezione;
    }


    public void setSezione(String sezione) {
        this.sezione = sezione;
    }


    public String getMatricola() {
        return matricola;
    }


    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    public int getNumeroProgressivo() {
        return numeroProgressivo;
    }

    public void setNumeroProgressivo(int numeroProgressivo) {
        this.numeroProgressivo = numeroProgressivo;
    }
}

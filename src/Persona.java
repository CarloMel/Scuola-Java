

abstract class Persona {
    private String nome;
    private String cognome;
    private int annoDiNascita;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnnoDiNascita() {
        return this.annoDiNascita;
    }

    //  Filtra Docenti nati => 1964 && <= 1994 , Studenti nati <= 2018
    public abstract void setAnnoDiNascita(int annoDiNascita);
}

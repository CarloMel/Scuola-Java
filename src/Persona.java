

abstract class Persona {
    private String nome;
    private String cognome;
    // protected serve per  farsì che questa variabile venga vista dalle classi figlie
    protected int annoDiNascita;

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

    public abstract int getAnnoDiNascita();

    //  Filtra Docenti nati => 1964 && <= 1994 , Studenti nati <= 2018
    public abstract void setAnnoDiNascita(int annoDiNascita);
}

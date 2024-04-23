public class Docente extends Persona {
    private String materia;

    @Override
    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    @Override
    public void setAnnoDiNascita(int annoDiNascita) {

        boolean ripeti = true;
        do {
            if(annoDiNascita >= 1964 && annoDiNascita <= 1994 ) {
                this.annoDiNascita = annoDiNascita;
                ripeti = false;
            } else {
                System.out.println("Dato non corretto");
                System.out.println("Si accettano solo professori nati tra il 1964 e il 1994");
                annoDiNascita = scannerNumero.nextInt();
            }
        } while (ripeti); 
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}

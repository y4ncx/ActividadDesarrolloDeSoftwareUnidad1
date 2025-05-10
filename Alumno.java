public class Alumno {
    private String dni;
    private String nombreCompleto;
    private String numMatricula;

    public Alumno(String dni, String nombreCompleto, String numMatricula) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.numMatricula = numMatricula;
    }

    public String getDni() { return dni; }
    public String getNombreCompleto() { return nombreCompleto; }
    public String getNumMatricula() { return numMatricula; }

    public void setDni(String dni) { this.dni = dni; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
    public void setNumMatricula(String numMatricula) { this.numMatricula = numMatricula; }
}
public class Tribunal {
    private int numTribunal;
    private String lugarExamen;
    private int cantidadProfesores;
    private String alumnoPresente;
    private String tfcDefendido;
    private String fechaDefensa;

    public Tribunal(int numTribunal, String lugarExamen, int cantidadProfesores, String alumnoPresente, String tfcDefendido, String fechaDefensa) {
        this.numTribunal = numTribunal;
        this.lugarExamen = lugarExamen;
        this.cantidadProfesores = cantidadProfesores;
        this.alumnoPresente = alumnoPresente;
        this.tfcDefendido = tfcDefendido;
        this.fechaDefensa = fechaDefensa;
    }

    public int getNumTribunal() { return numTribunal; }
    public String getLugarExamen() { return lugarExamen; }
    public int getCantidadProfesores() { return cantidadProfesores; }
    public String getAlumnoPresente() { return alumnoPresente; }
    public String getTfcDefendido() { return tfcDefendido; }
    public String getFechaDefensa() { return fechaDefensa; }

    public void setNumTribunal(int numTribunal) { this.numTribunal = numTribunal; }
    public void setLugarExamen(String lugarExamen) { this.lugarExamen = lugarExamen; }
    public void setCantidadProfesores(int cantidadProfesores) { this.cantidadProfesores = cantidadProfesores; }
    public void setAlumnoPresente(String alumnoPresente) { this.alumnoPresente = alumnoPresente; }
    public void setTfcDefendido(String tfcDefendido) { this.tfcDefendido = tfcDefendido; }
    public void setFechaDefensa(String fechaDefensa) { this.fechaDefensa = fechaDefensa; }
}
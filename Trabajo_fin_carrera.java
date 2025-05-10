public class TrabajoFinCarrera {
    private int numOrden;
    private String tema;
    private String fechaInicio;
    private String alumnoRealiza;
    private String profesorDirige;

    public TrabajoFinCarrera(int numOrden, String tema, String fechaInicio, String alumnoRealiza, String profesorDirige) {
        this.numOrden = numOrden;
        this.tema = tema;
        this.fechaInicio = fechaInicio;
        this.alumnoRealiza = alumnoRealiza;
        this.profesorDirige = profesorDirige;
    }

    public int getNumOrden() { return numOrden; }
    public String getTema() { return tema; }
    public String getFechaInicio() { return fechaInicio; }
    public String getAlumnoRealiza() { return alumnoRealiza; }
    public String getProfesorDirige() { return profesorDirige; }

    public void setNumOrden(int numOrden) { this.numOrden = numOrden; }
    public void setTema(String tema) { this.tema = tema; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setAlumnoRealiza(String alumnoRealiza) { this.alumnoRealiza = alumnoRealiza; }
    public void setProfesorDirige(String profesorDirige) { this.profesorDirige = profesorDirige; }
}
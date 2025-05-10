public class Grupo {
    private int numGrupo;
    private int numComponentes;
    private String fechaIncorporacion;

    public Grupo(int numGrupo, int numComponentes, String fechaIncorporacion) {
        this.numGrupo = numGrupo;
        this.numComponentes = numComponentes;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public int getNumGrupo() { return numGrupo; }
    public int getNumComponentes() { return numComponentes; }
    public String getFechaIncorporacion() { return fechaIncorporacion; }

    public void setNumGrupo(int numGrupo) { this.numGrupo = numGrupo; }
    public void setNumComponentes(int numComponentes) { this.numComponentes = numComponentes; }
    public void setFechaIncorporacion(String fechaIncorporacion) { this.fechaIncorporacion = fechaIncorporacion; }
}
public class Profesor {
    private String id;
    private String nombreCompleto;
    private String domicilio;

    public Profesor(String id, String nombreCompleto, String domicilio) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
    }

    public String getId() { return id; }
    public String getNombreCompleto() { return nombreCompleto; }
    public String getDomicilio() { return domicilio; }

    public void setId(String id) { this.id = id; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }
}
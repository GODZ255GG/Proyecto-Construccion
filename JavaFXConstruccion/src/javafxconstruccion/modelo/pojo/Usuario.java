package javafxconstruccion.modelo.pojo;

public class Usuario {
    private int idUsuario;
    private String username;
    private String password;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String nombre;
    private String correoInstitucional;
    private String numeroTelefono;
    private String tipoUsuario;
    private int codigoRespuesta;

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, String apellidoMaterno, String apellidoPaterno, String nombre, String correoInstitucional, String numeroTelefono, String tipoUsuario, int codigoRespuesta) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.nombre = nombre;
        this.correoInstitucional = correoInstitucional;
        this.numeroTelefono = numeroTelefono;
        this.tipoUsuario = tipoUsuario;
        this.codigoRespuesta = codigoRespuesta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(int codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }
    
    @Override
    public String toString(){
        return nombre+ " "+ apellidoPaterno+" "+apellidoMaterno;
    }
}

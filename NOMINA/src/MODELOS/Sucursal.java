package MODELOS;

public class Sucursal
{
    private Long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String codigoPostal;
    private String pais;
    private String telefono;
    private String correo;
    private String horasAtencion;
    private String numeroEmpleados;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombre, String direccion, String ciudad, String codigoPostal, String pais, String telefono, String correo, String horasAtencion, String numeroEmpleados) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.telefono = telefono;
        this.correo = correo;
        this.horasAtencion = horasAtencion;
        this.numeroEmpleados = numeroEmpleados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHorasAtencion() {
        return horasAtencion;
    }

    public void setHorasAtencion(String horasAtencion) {
        this.horasAtencion = horasAtencion;
    }

    public String getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(String numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", horasAtencion='" + horasAtencion + '\'' +
                ", numeroEmpleados='" + numeroEmpleados + '\'' +
                '}';
    }
}

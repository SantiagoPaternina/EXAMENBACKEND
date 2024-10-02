package MODELOS;

import java.time.LocalDate;

public class Beneficiario
{
    private Long id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String seguro;
    private String direccion;
    private String correo;
    private String telefono;
    private String tipoBeneficio;
    private String valorBeneficio;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellidos, LocalDate fechaNacimiento, String seguro, String direccion, String correo, String telefono, String tipoBeneficio, String valorBeneficio) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.seguro = seguro;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoBeneficio = tipoBeneficio;
        this.valorBeneficio = valorBeneficio;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(String tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }

    public String getValorBeneficio() {
        return valorBeneficio;
    }

    public void setValorBeneficio(String valorBeneficio) {
        this.valorBeneficio = valorBeneficio;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", seguro='" + seguro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", tipoBeneficio='" + tipoBeneficio + '\'' +
                ", valorBeneficio='" + valorBeneficio + '\'' +
                '}';
    }
}

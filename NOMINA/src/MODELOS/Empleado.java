package MODELOS;

import java.time.LocalDate;

public class Empleado
{
    private Long id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String cedula;
    private String direccion;
    private String nacionalidad;
    private String cargo;
    private String estadoCivil;
    private Integer salario;
    private String tipoContrato;
    private String vacaciones;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellidos, String correo, String telefono, LocalDate fechaNacimiento, String cedula, String direccion, String nacionalidad, String cargo, String estadoCivil, Integer salario, String tipoContrato, String vacaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.cargo = cargo;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
        this.tipoContrato = tipoContrato;
        this.vacaciones = vacaciones;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(String vacaciones) {
        this.vacaciones = vacaciones;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", cargo='" + cargo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", salario=" + salario +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", vacaciones='" + vacaciones + '\'' +
                '}';
    }
}

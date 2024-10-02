package MODELOS;

import java.time.LocalDate;

public class Area
{
    private Long id;
    private LocalDate fechaCreacion;
    private String direccion;
    private String numeroTorre;
    private String equiposDisponibles;
    private String softwareManejable;
    private Boolean tieneVentanas;
    private Boolean tieneAireacondicionado;
    private String capacidadMaxima;
    private Integer personalActual;

    public Area() {
    }

    public Area(Long id, LocalDate fechaCreacion, String direccion, String numeroTorre, String equiposDisponibles, String softwareManejable, Boolean tieneVentanas, Boolean tieneAireacondicionado, String capacidadMaxima, Integer personalActual) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.direccion = direccion;
        this.numeroTorre = numeroTorre;
        this.equiposDisponibles = equiposDisponibles;
        this.softwareManejable = softwareManejable;
        this.tieneVentanas = tieneVentanas;
        this.tieneAireacondicionado = tieneAireacondicionado;
        this.capacidadMaxima = capacidadMaxima;
        this.personalActual = personalActual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTorre() {
        return numeroTorre;
    }

    public void setNumeroTorre(String numeroTorre) {
        this.numeroTorre = numeroTorre;
    }

    public String getEquiposDisponibles() {
        return equiposDisponibles;
    }

    public void setEquiposDisponibles(String equiposDisponibles) {
        this.equiposDisponibles = equiposDisponibles;
    }

    public String getSoftwareManejable() {
        return softwareManejable;
    }

    public void setSoftwareManejable(String softwareManejable) {
        this.softwareManejable = softwareManejable;
    }

    public Boolean getTieneVentanas() {
        return tieneVentanas;
    }

    public void setTieneVentanas(Boolean tieneVentanas) {
        this.tieneVentanas = tieneVentanas;
    }

    public Boolean getTieneAireacondicionado() {
        return tieneAireacondicionado;
    }

    public void setTieneAireacondicionado(Boolean tieneAireacondicionado) {
        this.tieneAireacondicionado = tieneAireacondicionado;
    }

    public String getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(String capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getPersonalActual() {
        return personalActual;
    }

    public void setPersonalActual(Integer personalActual) {
        this.personalActual = personalActual;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", direccion='" + direccion + '\'' +
                ", numeroTorre='" + numeroTorre + '\'' +
                ", equiposDisponibles='" + equiposDisponibles + '\'' +
                ", softwareManejable='" + softwareManejable + '\'' +
                ", tieneVentanas=" + tieneVentanas +
                ", tieneAireacondicionado=" + tieneAireacondicionado +
                ", capacidadMaxima='" + capacidadMaxima + '\'' +
                ", personalActual=" + personalActual +
                '}';
    }
}

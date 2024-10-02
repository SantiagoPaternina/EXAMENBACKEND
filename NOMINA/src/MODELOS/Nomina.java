package MODELOS;

import java.time.LocalDate;

public class Nomina
{
    private Long id;
    private Double salarioBase;
    private Double valorHorasExtra;
    private Double bonificaciones;
    private Double salarioNeto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaPago;
    private Double impuestos;
    private String formaPago;

    public Nomina() {
    }

    public Nomina(Long id, Double salarioBase, Double valorHorasExtra, Double bonificaciones, Double salarioNeto, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaPago, Double impuestos, String formaPago) {
        this.id = id;
        this.salarioBase = salarioBase;
        this.valorHorasExtra = valorHorasExtra;
        this.bonificaciones = bonificaciones;
        this.salarioNeto = salarioNeto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaPago = fechaPago;
        this.impuestos = impuestos;
        this.formaPago = formaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getValorHorasExtra() {
        return valorHorasExtra;
    }

    public void setValorHorasExtra(Double valorHorasExtra) {
        this.valorHorasExtra = valorHorasExtra;
    }

    public Double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public Double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(Double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "id=" + id +
                ", salarioBase=" + salarioBase +
                ", valorHorasExtra=" + valorHorasExtra +
                ", bonificaciones=" + bonificaciones +
                ", salarioNeto=" + salarioNeto +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", fechaPago=" + fechaPago +
                ", impuestos=" + impuestos +
                ", formaPago='" + formaPago + '\'' +
                '}';
    }
}

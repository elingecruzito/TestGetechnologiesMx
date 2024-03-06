package mx.getechnologies.test.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class ReporteVehiculosModel {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "tiempo")
    private Double tiempo;

    @Column(name = "total")
    private double total;


    public ReporteVehiculosModel() {
    }

    public ReporteVehiculosModel(String placa, Double tiempo, double total) {
        this.placa = placa;
        this.tiempo = tiempo;
        this.total = total;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


}

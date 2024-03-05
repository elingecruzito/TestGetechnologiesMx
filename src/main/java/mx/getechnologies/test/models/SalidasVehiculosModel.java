package mx.getechnologies.test.models;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "salidas")
@EntityListeners(AuditingEntityListener.class)
public class SalidasVehiculosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idSalidas;

    @Column(name = "placa")
    private String placa;

    @Column(name = "salida")
    private Date salida;

    @Column(name = "importe_total")
    private double importeTotal;



    public SalidasVehiculosModel() {
    }
    

    public SalidasVehiculosModel(Long idSalidas, String placa, Date salida, double importeTotal) {
        this.idSalidas = idSalidas;
        this.placa = placa;
        this.salida = salida;
        this.importeTotal = importeTotal;
    }

    public Long getIdSalidas() {
        return this.idSalidas;
    }

    public void setIdSalidas(Long idSalidas) {
        this.idSalidas = idSalidas;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getSalida() {
        return this.salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public double getImporteTotal() {
        return this.importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

}

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

    @Column(name = "entrada")
    private int entrada;

    @Column(name = "salida")
    private Date salida;

    @Column(name = "minutos")
    private int tiempo;

    @Column(name = "importe_total")
    private double importeTotal;


    public SalidasVehiculosModel() {
    }

    public SalidasVehiculosModel(Long idSalidas, int entrada, Date salida, int tiempo, double importeTotal) {
        this.idSalidas = idSalidas;
        this.entrada = entrada;
        this.salida = salida;
        this.tiempo = tiempo;
        this.importeTotal = importeTotal;
    }

    public Long getIdSalidas() {
        return this.idSalidas;
    }

    public void setIdSalidas(Long idSalidas) {
        this.idSalidas = idSalidas;
    }

    public int getEntrada() {
        return this.entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public Date getSalida() {
        return this.salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public int getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getImporteTotal() {
        return this.importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }


}

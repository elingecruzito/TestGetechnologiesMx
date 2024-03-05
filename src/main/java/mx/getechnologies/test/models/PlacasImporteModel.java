package mx.getechnologies.test.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class PlacasImporteModel {

    @Id
    @Column(name = "id")
    private Long id;
    
    @Column(name = "placa")
    private String placa;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "importe")
    private Float importe;


    public PlacasImporteModel() {
    }


    public PlacasImporteModel(Long id, String placa, String tipo, Float importe) {
        this.id = id;
        this.placa = placa;
        this.tipo = tipo;
        this.importe = importe;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getImporte() {
        return this.importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

}

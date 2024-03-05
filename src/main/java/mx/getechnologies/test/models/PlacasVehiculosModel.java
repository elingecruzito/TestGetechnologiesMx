package mx.getechnologies.test.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placas")
@EntityListeners(AuditingEntityListener.class)
public class PlacasVehiculosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPlaca;

    @Column(name = "placa")
    private String placa;

    @Column(name = "tipo")
    private int idTipo;


    public PlacasVehiculosModel() {
    }


    public PlacasVehiculosModel(Long idPlaca, String placa, int idTipo) {
        this.idPlaca = idPlaca;
        this.placa = placa;
        this.idTipo = idTipo;
    }


    public Long getIdPlaca() {
        return this.idPlaca;
    }

    public void setIdPlaca(Long idPlaca) {
        this.idPlaca = idPlaca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdTipo() {
        return this.idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }


}

package mx.getechnologies.test.models;
import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entradas")
@EntityListeners(AuditingEntityListener.class)
public class EntradasVehiculosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEntrada;

    @Column(name = "placa")
    private String placa;

    @Column(name = "entrada")
    @CreatedDate
    private Date entrada;


    public EntradasVehiculosModel() {
    }


    public EntradasVehiculosModel(Long idEntrada, String placa, Date entrada) {
        this.idEntrada = idEntrada;
        this.placa = placa;
        this.entrada = entrada;
    }


    public Long getIdEntrada() {
        return this.idEntrada;
    }

    public void setIdEntrada(Long idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getEntrada() {
        return this.entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }


}

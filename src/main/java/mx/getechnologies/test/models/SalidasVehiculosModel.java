package mx.getechnologies.test.models;

import java.time.LocalTime;

public class SalidasVehiculosModel {

    private Long idSalidas;
    private String placa;
    private LocalTime salida;


    public SalidasVehiculosModel() {
    }


    public SalidasVehiculosModel(Long idSalidas, String placa, LocalTime salida) {
        this.idSalidas = idSalidas;
        this.placa = placa;
        this.salida = salida;
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

    public LocalTime getSalida() {
        return this.salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }
    

}

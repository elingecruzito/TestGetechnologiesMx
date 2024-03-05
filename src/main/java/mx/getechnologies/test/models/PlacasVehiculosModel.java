package mx.getechnologies.test.models;

public class PlacasVehiculosModel {

    private Long idPlaca;
    private String placa;
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

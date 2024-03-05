package mx.getechnologies.test.models;

public class TiposVehiculosModel {

    public static final int CORTE_SALIDA = 0;
    public static final int CORTE_MENSUAL = 1;
    public static final int CORTE_SIN_COSTO = 2;

    private Long idTipo;
    private String tipo;
    private double importe;
    private int corte;


    public TiposVehiculosModel() {
    }

    public TiposVehiculosModel(Long idTipo, String tipo, double importe, int corte) {
        this.idTipo = idTipo;
        this.tipo = tipo;
        this.importe = importe;
        this.corte = corte;
    }

    public Long getIdTipo() {
        return this.idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCorte() {
        return this.corte;
    }

    public void setCorte(int corte) {
        this.corte = corte;
    }

}

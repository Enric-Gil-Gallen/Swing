package modelo.datos;

public class TarifaDia extends Tarifa{
    private Tarifa tarifa;
    private float precioEspecial = 0;
    private Integer tarifaActual = 2;
    private String dia;

    public TarifaDia(Cliente cliente, String dia) {
        super(cliente);
    }

    public float getPrecioEspecial() {
        return precioEspecial;
    }

    public Integer getTarifaActual() {
        return tarifaActual;
    }

    public String getDia() {
        return dia;
    }
}

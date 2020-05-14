package modelo.datos;

public class TarifaDia extends Tarifa{
    private Tarifa tarifa;
    private double precioEspecial = 0;
    private double precioFuera = 15;
    private Integer dia;


    public Tarifa getTarifa() {
        return tarifa;
    }

    public double getPrecioFuera() {
        return precioFuera;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }


    public Integer getDia() {
        return dia;
    }
}

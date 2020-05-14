package modelo.datos;

public class TarifaDia extends Tarifa{

    private double precioEspecial = 0;
    private double precioFuera = 15;
    private Integer dia;

    public TarifaDia(double precio, String ip) {
        super(precio, ip);
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

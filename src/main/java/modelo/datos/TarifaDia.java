package modelo.datos;

public class TarifaDia extends Tarifa{

    private double precioEspecial;
    private double precioFuera ;
    private int dia;

    public TarifaDia(double precio, String ip, double precioEspecial, double precioFuera, int dia) {
        super(precio, ip);
        this.precioEspecial = precioEspecial;
        this.precioFuera = precioFuera;
        this.dia = dia;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public double getPrecioFuera() {
        return precioFuera;
    }

    public int getDia() {
        return dia;
    }
}

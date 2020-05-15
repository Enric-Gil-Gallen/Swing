package modelo.datos;

public class TarifaDia extends Tarifa{

    private double precioEspecial;

    private int dia;

    public TarifaDia(double precio, String ip, double precioEspecial, int dia) {
        super(precio, ip);
        this.precioEspecial = precioEspecial;
        this.dia = dia;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }


    public int getDia() {
        return dia;
    }
}

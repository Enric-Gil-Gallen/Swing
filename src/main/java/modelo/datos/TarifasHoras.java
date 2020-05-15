package modelo.datos;

public class TarifasHoras extends Tarifa {
    int horaInicio;
    int horaFinal;
    private double precioEspecial;
    private double precioFuera;

    public TarifasHoras(double precio, String ip, int horaInicio, int horaFinal, double precioEspecial, double precioFuera) {
        super(precio, ip);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.precioEspecial = precioEspecial;
        this.precioFuera = precioFuera;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public double getPrecioFuera() {
        return precioFuera;
    }
}

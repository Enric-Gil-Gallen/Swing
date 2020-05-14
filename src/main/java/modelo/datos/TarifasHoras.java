package modelo.datos;

public class TarifasHoras extends Tarifa {
    Integer horaInicio;
    Integer horaFinal;
    private double precioEspecial = 0.5;
    private double precioFuera = 15;

    public TarifasHoras(double precio, String ip, Integer horaInicio, Integer horaFinal, double precioEspecial, double precioFuera) {
        super(precio, ip);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.precioEspecial = precioEspecial;
        this.precioFuera = precioFuera;
    }

    public double getPrecioFuera() {
        return precioFuera;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

}

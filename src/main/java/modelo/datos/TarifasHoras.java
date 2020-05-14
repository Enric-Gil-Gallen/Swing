package modelo.datos;

public class TarifasHoras extends Tarifa {
    private Tarifa tarifa;
    Integer horaInicio;
    Integer horaFinal;
    private double precioEspecial = 0.5;
    private double precioFuera = 15;
    private Integer tarifaActual = 2;

    public TarifasHoras(Cliente cliente, Integer horaInicio, Integer horaFinal) {
        super(cliente);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
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

    public Integer getTarifaActual() {
        return tarifaActual;
    }
}
package modelo.datos;

public class TarifasHoras extends Tarifa {
    private Tarifa tarifa;
    Integer horaInicio;
    Integer horaFinal;
    private float precioEspecial = 5;
    private Integer tarifaActual = 1;

    public TarifasHoras(Cliente cliente, Integer horaInicio, Integer horaFinal) {
        super(cliente);
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public float getPrecioEspecial() {
        return precioEspecial;
    }

    public Integer getTarifaActual() {
        return tarifaActual;
    }
}

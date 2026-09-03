
public class oferta extends habitacion {
    double descuento;

    public oferta(double descuento, String tipo, String n_habitacion, double tarifa, int cantidad_noches) {
        super(tipo, n_habitacion, tarifa, cantidad_noches);
        this.descuento = tarifa * 0.15;
    }

    public double calculartotal(double total) {
        return total = cantidad_noches * (descuento - tarifa);

    }
}

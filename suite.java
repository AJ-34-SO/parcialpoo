package parcial;

public class suite extends habitacion {
    double recargo;

    public suite(double recargo,String tipo,String n_habitacion,double tarifa,int cantidad_noches) {
        super(tipo, n_habitacion, tarifa,cantidad_noches);
        this.recargo =tarifa*0.20;
    }
    public double calculartotal(double total){
        return total=(tarifa-recargo)-cantidad_noches;
    }
}

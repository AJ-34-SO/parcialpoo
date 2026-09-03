public class reserva {
    int numero_de_habitaciones;



    public reserva(int numero_de_habitaciones){
        this.numero_de_habitaciones=numero_de_habitaciones;

    }
    public void devolver_habitacion(int numero_de_habitaciones)throws mayornumerodehabitacionesException,menornumerodehabitacionesException {
        if(numero_de_habitaciones>5) {
            throw new mayornumerodehabitacionesException("numero de habitacion no permitido");
        }if(numero_de_habitaciones<0) {
            throw new menornumerodehabitacionesException("numero de habitacion no permitido");
        }

    }
}

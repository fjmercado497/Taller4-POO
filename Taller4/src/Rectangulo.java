public class Rectangulo {
    private double longitud;
    private double ancho;


    public  Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double calcularArea() {
        return ancho * longitud;
    }

    public double calculaPerimetro() {
        return (2 * ancho) + (2 * longitud);
    }
}


public class PruebaRectangulo {
    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo(2,5);

        System.out.println("el area del rectangulo es:"+rect.calcularArea());
        System.out.println("el perimetro del rectangulo es:"+rect.calculaPerimetro());
    }

}

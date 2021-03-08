//Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura,
//proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de
//sus lados iguales, el perímetro, el valor del ángulo vé//



public class PruebaDeTrianguloIsso {
    public static void main(String[] args) {
        TrianguloIssoceles prueba = new TrianguloIssoceles (5,8);
        System.out.printf("la altura es:%.2f\n", prueba.getAltura());
        System.out.printf("la base es:%.2f\n", prueba.getBase());
        System.out.printf("la longitud de sus lados iguales es: %.2f\n", prueba.hypotensusa());
        System.out.printf("el perimetro es:%.2f\n", prueba.calculaperimetro());
        System.out.printf("el angulo vertice es:%.2f° \n", prueba.calculaangulovertice());



    }
}



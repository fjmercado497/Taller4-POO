//Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura,
//proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de
//sus lados iguales, el perímetro, el valor del ángulo vé//
public class TrianguloIssoceles {
   private double base;
   private  double altura;
   private  double hypotensusa;


     public TrianguloIssoceles (double base, double altura) {
         this.base = base;
         this.altura = altura;
     }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaarea(){
         return (base*altura)/2;
    }
    public double hypotensusa(){
        return hypotensusa = Math.sqrt((base*base)+(altura*altura));
    }
    public double calculaperimetro(){return 2*hypotensusa+base; }
    public double calculaangulovertice(){
         double angulobase = Math.atan(altura/(base/2));
         angulobase = Math.toDegrees(angulobase);
         return 180-(2*angulobase);
    }

}


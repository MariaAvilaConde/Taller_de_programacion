package calculadora;


public class Principal {

    public static void main(String[] args) {
        
        Calculadora c1 = new Calculadora();
        
        c1.sumar(2,8);
        c1.restar(8, 2);
        c1.multiplicar(7, 8);
        c1.dividir(8, 0);
    }
}

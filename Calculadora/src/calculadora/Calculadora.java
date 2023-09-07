package calculadora;

public class Calculadora {

    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public int sumar(int a, int b) {
        suma = a + b;
        System.out.println("la suma es: " + suma);
        return suma;
    }

    public int restar(int a, int b) {
        resta = a - b;
        System.out.println("la resta es: " + resta);
        return resta;
    }
    
    public int multiplicar(int a, int b) {
        multiplicacion = a * b;
        System.out.println("la multiplicacion es: " + multiplicacion);
        return multiplicacion;
    }
    
    public int dividir(int a, int b) {
        int division = 0;
    
        if(b != 0){
            division = a / b;
            System.out.println("el cociente es: " + division);
        }   else {
            System.out.println("la division no se puede");
        }
        return division;
    }
}

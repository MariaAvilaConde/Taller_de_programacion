/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */package calculadora;



import javax.swing.JOptionPane;


public class Calculadora {

    int a;
    int b;
    int suma;
    int resta;
    int mulplicar;
    int dividir;
    int resto;

     public void ingresarDaos() {
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el primer digito"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el segundo numero"));
    }

     public int sumar() {
        suma = a + b;
        JOptionPane.showMessageDialog(null, "la suma es: " + suma);
        return suma;
    }

     public int restar() {
        resta = a - b;
        JOptionPane.showMessageDialog(null, "la resta es: " + resta);
        return resta;
    }

     public int multiplicar() {
        if (a == 0 || b == 0) {
            JOptionPane.showMessageDialog(null, "La multiplicacion es 0");
        } else {
            mulplicar = a * b;
            JOptionPane.showMessageDialog(null, "la multiplicacion es: " + dividir);
        }
        return mulplicar;
    }

     public int dividir() {
        if (a == 0 || b == 0) {
            JOptionPane.showMessageDialog(null, "no se puede dividir");
        } else {
            dividir = a / b;
            JOptionPane.showMessageDialog(null, "la division es: " + dividir);
        }
        return dividir;
    }

     public int resto() {
        if (a == 0 || b == 0) {
            JOptionPane.showMessageDialog(null, "no hay resto");
        } else {
            resto = a % b;
            JOptionPane.showMessageDialog(null, "el resto es: " + resto);
        }
        return resto;
    }
}


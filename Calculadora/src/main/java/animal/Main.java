/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author maria
 */
    public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Fido", 3, "Perro");
        Animal gato = new Animal("Whiskers", 2, "Gato");

        perro.comer();
        gato.hacerSonido();
    }
}


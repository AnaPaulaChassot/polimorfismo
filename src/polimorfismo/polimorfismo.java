/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Suporte
 */
public class polimorfismo {
    
    public static void main(String[] args) {
       /*
        calculadora c = new calculadora();
        System.out.println(c.somar(2,3,6));
        */
       
       gato g = new gato();
       cachorro c = new cachorro();
       pato p = new pato();
       
       g.comunicar();
       c.comunicar();
       p.comunicar();
    }
    
    
}

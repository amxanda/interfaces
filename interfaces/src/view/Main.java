package view;

import model.AreaCalculavel;
import model.Circulo;
import model.Quadrado;
import model.Retangulo;

public class Main {
 public static void main(String[] args) {
     AreaCalculavel quadrado = new Quadrado(4);
     AreaCalculavel retangulo = new Retangulo(3, 2);
     AreaCalculavel circulo = new Circulo(5);

     System.out.println("Área do Quadrado: " + quadrado.calculaArea());
     System.out.println("Área do Retângulo: " + retangulo.calculaArea());
     System.out.println("Área do Círculo: " + circulo.calculaArea());
 }
}

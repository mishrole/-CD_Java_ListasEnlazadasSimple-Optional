package com.codingdojo.listasenlazadas.simple;

public class PruebaLista {

	public static void main(String[] args) {
		ListaSimpleEnlazada sll = new ListaSimpleEnlazada();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        
        sll.find(10);
        sll.find(5);
        sll.find(15);
        sll.find(2);
        
        System.out.println("Antes de eliminar en posición");
        sll.printValues();
        sll.removeIn(0);
        System.out.println("Después de eliminar en posición");
        sll.printValues();
	}

}

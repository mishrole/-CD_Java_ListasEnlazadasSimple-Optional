package com.codingdojo.listasenlazadas.simple;

public class ListaSimpleEnlazada {
	public Nodo head;
	
	public ListaSimpleEnlazada() {
		this.head = null;
	}
	
	public void add(int value) {
		Nodo newNodo = new Nodo(value);
		if(head == null) {
			head = newNodo;
		} else {
			Nodo runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNodo;
		}
	}
	
	public void remove() {
		Nodo previo = null;
		
		if(head != null) {
			Nodo runner = head;
			while(runner.next != null) {
				previo = runner;
				runner = runner.next;
			}
			
			if(runner.next == null) {
				previo.next = null;
			}
		}
	}
	
	public void printValues() {
		Nodo runner = head;
		while(runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
	
	public Nodo find(int value) {
		Nodo runner = head;
		Nodo found = null;
		while(runner != null) {
			if (runner.value == value) {
				found = runner;
				break;
			} else {
				runner = runner.next;				
			}
		}
		
		if (found != null) {
			System.out.println("Nodo encontrado: " + found.value);
		} else {
			System.out.println("Nodo con valor " + value + " no encontrado");
		}
		
		return found;
	}
	
	public void removeIn(int id) {
		Nodo runner = head;
		Nodo previo = null;
		int index = -1;
		
		while(runner != null) {
			index++;
			
			if (id == index) {
				// Es cabeza
				if (previo == null) {
					head = runner.next;
					break;
				}
				
				// Es colita
				if (runner.next == null) {
					if (previo != null) {
						previo.next = null;
						break;
					}
				}
				
				// Entre cabeza y colita
				if (runner.next != null && previo != null) {
					previo.next = runner.next;
					break;
				}
			}
			
			previo = runner;
			runner = runner.next;
		}
	}
}

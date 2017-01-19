package com.epn;

public class Nodo {
	private String dato;
	 Nodo atras;
	 Nodo despues;
	

	public Nodo(String dato,Nodo despues,Nodo atras ){
		this.dato=dato;
		this.despues = despues;
		this.atras=atras;
	}
	public Nodo(String dato){
		// cuando no hay nodos
		//this.dato= dato;
		//this.atras=null;
		//this.despues=null;
		
		this(dato,null,null);//primer Nodo
	}
	
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	
	
	public Nodo getAtras() {
		return atras;
	}
	public void setAtras(Nodo atras) {
		this.atras = atras;
	}
	public Nodo getDespues() {
		return despues;
	}
	public void setDespues(Nodo despues) {
		this.despues = despues;
	}
	@Override
	public String toString() {
		return "Nodo [dato=" + dato;
	}
	
	

}

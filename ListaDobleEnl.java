package com.epn;

public class ListaDobleEnl {
	private Nodo inicio;
	private Nodo fin;
	public ListaDobleEnl() {
		// crea lista vacía
		this.inicio=null;
		this.fin= null;
		
	}
	
	public ListaDobleEnl(Nodo inicio, Nodo fin) {
		super();
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public boolean estaVacia(){
		return (inicio== null);
	}
	
	public void agregarfinal(String dato){
		if(!estaVacia()){
			fin= new Nodo(dato,null,fin);
			fin.atras.despues= fin;
			
		}else{
			inicio=fin= new Nodo(dato);// cuando aún no hay nodos
		}
		
	}
	
	public void agregarinicio(String dato){
		if(!estaVacia()){
			
			inicio= new Nodo(dato,inicio,null);
			
			inicio.despues.atras= inicio;
			
			
		}else{
			inicio=fin= new Nodo(dato);// cuando aún no hay nodos
		}
		
	}
	
	
	//metodo para mostrar de inicio a fin
	public String mostrarlistardeiniciofin(){
		String salida="";
		if(!estaVacia()){
		salida+="<=> ";
			Nodo aux = inicio;
			while(aux!=null){
				salida= salida +"["+aux.getDato() + "]<=>";
				aux=aux.despues;
			}
		}
		return salida;
	}
	/*fin a inicio
	public String mostrarlistardefininicio(){
		String salida="";
		if(!estaVacia()){
		salida+="<=> ";
			Nodo aux = fin;
			while(aux!=null){
				salida= salida +"["+aux.getDato() + "]<=>";
				aux= aux.atras;
			}
		}
		return salida;
	}*/
	
	
	
	
	
	
	
	
	
	
}

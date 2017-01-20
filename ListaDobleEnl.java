package strc;

public class ListaDobleEnl
{
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
	}
	
	
	
	
	public Nodo buscarporDato(String dato){
		Nodo aux=inicio;
		if (estaVacia()){
			return null;
			}
		else {
		while(aux!=null){
			
			if( aux.getDato().equalsIgnoreCase(dato)){
				return aux;
				}
			aux=aux.getDespues();
			}
		
		}
		return null;		
	}
public Nodo buscarporIndice(int indice){
		
		Nodo aux=inicio;
		int cont=0;
		
		if (estaVacia()){
			return null;}
		else {
		while(aux!=null){
			cont++;
			if (cont==indice){
				return aux;}
			else {
				aux=aux.getDespues();}
					}
		return null;			
		}
	}
	

	public void EliminarPorIndice(ListaDobleEnl lista,int dato)
	{
		if (lista.buscarporIndice(dato)!=null)
		{
			Nodo eliminar; //nodo auxiliar
			eliminar= lista.buscarporIndice(dato);
			
			//enlaces 
			Nodo p=eliminar.getAtras(); // enlace
			Nodo q=eliminar.getDespues();
			
			if (p==null)
			{	
			q.setAtras(null);
			inicio=q;
			
			}
			else
			{
				if(q==null)
				{  
				p.setDespues(null);
				fin=p;
				}
				else 
				{
				p.setDespues(q);
				q.setAtras(p);
				}
			}
		}
		
		
	}
	
	public void EliminarPorDato(ListaDobleEnl lista, String dato)
	{
		
		if (lista.buscarporDato(dato)!= null)
		{
			Nodo eliminar;
			eliminar= lista.buscarporDato(dato);
			
			//enlaces 
			Nodo p=eliminar.getAtras();
			Nodo q=eliminar.getDespues();
			
			if (p==null)
			{	
			q.setAtras(null);
			inicio=q;
			
			}
			else
			{
				if(q==null)
				{  
				p.setDespues(null);
				fin=p;
				}
				else 
				{
				p.setDespues(q);
				q.setAtras(p);
				}
			}
		}
	}
	
	
	
	
	
	
}

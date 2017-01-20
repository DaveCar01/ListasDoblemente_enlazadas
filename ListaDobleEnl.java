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
	
	
	
	public void eliminar(String entrada)
	{
		Nodo actual;
		boolean encontrado= false;
		actual = inicio;
		
		while((actual != null)&& (!encontrado)) 
		{
			encontrado = (actual.getDato()== entrada);
			if(!encontrado)
				actual=actual.despues;
		}
		
		if(actual !=null)
		{
			if(actual== inicio)
				{
					inicio=actual.despues;
					if(actual.despues != null)
						actual.despues.atras = null;
				}
		}
		else if ( actual.despues != null) // no es el ultimo nodo
		{
			actual.atras.despues = actual.despues;
			actual.despues.atras = actual.atras;
		}
		else // ultimo nodo
		{
			actual.atras.despues = null;
			actual =null;
		}
	}
	
	/*             public void buscar(Integer valor){
                        if (inicio != null){
                                   NodoDoble aux = inicio;
                                  
                                   int cont = 0;
                                   while (aux != null){
                                               if (aux.getDato() == valor ){
                                                           cont++;
                                                           aux = aux.getSiguiente();
                                                          
                                               }
                                  
                                   }                                      
                       
                        }
                       
                        }
           
*/
	
	public void buscarElmento( String dato)
	{
		if( inicio != null)
		{
			Nodo auxiliar = inicio;
			int contador=0;
			
			while ( auxiliar != null)
			{
				if (auxiliar.getDato() == dato)
				{
					contador ++;
					auxiliar = auxiliar.getDespues();
				}
			}
		}
	}
	
	
	
	
	
	
}

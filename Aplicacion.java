package strc;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) 
	{
		ListaDobleEnl listad= new ListaDobleEnl();
		 int opcion=0;
		String elemento = null;
		 
		 do{
			 try{
				opcion =Integer.parseInt(JOptionPane.showInputDialog(null,
				  "1.Insertar al inicio \n"
				 +"2. Insertar al final \n "
				 +"3. Mostrar la lista de inicio a fin\n"
				 +"4. Mostrar la lista de fin a inicio \n"
				 +"5. Buscar por dato\n"
				 +"6.Buscar por indice\n"
				 +"7. Eliminar\n"
				 +"8.Eliminar por dato \n"
				 +"9.salir"
				 +"Menu de Opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1:
					elemento=JOptionPane.showInputDialog("Ingrese el dato al inicio",JOptionPane.INFORMATION_MESSAGE);
					listad.agregarinicio(elemento);
					
					
					break;
				case 2:
					elemento=JOptionPane.showInputDialog("Ingrese el dato al final",JOptionPane.INFORMATION_MESSAGE);
					listad.agregarfinal(elemento);
					break;
				case 3:
					System.out.println(listad.mostrarlistardeiniciofin());
					JOptionPane.showMessageDialog(null, "Lista de inicio a fin:\n"+listad.mostrarlistardeiniciofin());
		
					break;
					
				case 4:
					System.out.println(listad.mostrarlistardefininicio());
					JOptionPane.showMessageDialog(null, "Lista de fin a inicio : \n"+listad.mostrarlistardefininicio());
					
					break;
				case 5:
					String datoBuscar=JOptionPane.showInputDialog("Ingrese el dato a buscar");
				
					if(listad.buscarporDato(datoBuscar)!=null)
					{
					JOptionPane.showMessageDialog(null, listad.buscarporDato(datoBuscar).getDato());
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO existe");
					}
	
					break;
				case 6:
					
					int indice=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice a buscar:"));
					
					if(listad.buscarporIndice(indice)!=null){
						JOptionPane.showMessageDialog(null, listad.buscarporIndice(indice).getDato());}
					else{
						JOptionPane.showMessageDialog(null, "no existe el dato");
						
					}
					break;
					
				case 7:
					int indice2=Integer.parseInt(JOptionPane.showInputDialog("nodo a Eliminar por indice:"));
					
					listad.EliminarPorIndice(listad, indice2);
					
					JOptionPane.showMessageDialog(null, "Lista de inicio a fin:\n"+listad.mostrarlistardeiniciofin());

					break;
				case 8:
					String indice3= JOptionPane.showInputDialog("Nodo a eliminar por dato");
						listad.EliminarPorDato(listad, indice3);
						JOptionPane.showMessageDialog(null, "Lista de inicio a fin: \n"+listad.mostrarlistardeiniciofin());
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Aplicacion fin","FIn",JOptionPane.INFORMATION_MESSAGE);
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "OPcion no valida","Error",JOptionPane.INFORMATION_MESSAGE);
					
					
					
				
				}
				 
			 }catch(NumberFormatException n){
				 JOptionPane.showMessageDialog(null, "erroe"+n.getMessage());
			 }
			 	
			 
		 }while(opcion!=9);
		 
		 
		
		System.out.println("Lista de inici a fin");

	}

}

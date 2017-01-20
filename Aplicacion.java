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
				 +"4. Buscar por indice\n"
				 +"5.Buscar por dato\n"
				 +"6. Eliminar\n"
				 +"7.salir"
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
				
					break;
				case 5:
				elemento=JOptionPane.showInputDialog( " que elemento desea buscar?",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showMessageDialog(null, "que elemto desea buscar?");
					listad.buscarElmento(elemento);
					break;
				
				case 6:
					elemento =JOptionPane.showInputDialog("Que elemnto desea eliminar de la lista?", JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showMessageDialog(null, "que elemento desea borrar? ");
					listad.eliminar(elemento);
					listad.mostrarlistardeiniciofin();
					break;
				
				case 7:
					
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "OPcion no valida","Error",JOptionPane.INFORMATION_MESSAGE);
					
					
					
				
				}
				 
			 }catch(NumberFormatException n){
				 JOptionPane.showMessageDialog(null, "erroe"+n.getMessage());
			 }
			 	
			 
		 }while(opcion!=7);
		 
		 
		
		System.out.println("Lista de inici a fin");

	}

}

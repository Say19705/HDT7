/**
 * @author andres Say Agosto 19705
 * traductor ingles-español
 */

//Importar
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class MainDic{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		/**
		 * Inicializar la clase binaryTree
		 * y las listas para podes formar el diccionario y luego recorrerlo
		 */
		BinaryTree bmt = new BinaryTree();
		Map<String, String> theMap = new Hashtable<String, String>();
		List<String> lista3 = new ArrayList<String>();
		List<String> lista4 = new ArrayList<String>();
		
		
		//Comenzar programa
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");

		
		System.out.println(System.getProperty("user.dir") + "\\nombre");

		/**
		 * Buscar los archivos txt
		 * el txt del ticcionario debe estar colocado de la siguiente manera.  llave,valor ej hi, hola
		 */
		File archivo_Dicc = new File(System.getProperty("user.dir") + "\\diccionario.txt");
		File archivo_pal = new File(System.getProperty("user.dir") + "\\texto.txt");
		if(archivo_Dicc.exists() && archivo_pal.exists()) {
			try {
				FileReader fr = new FileReader(archivo_Dicc);
				BufferedReader br = new BufferedReader(fr);
				
				String linea = " ";
				ArrayList<String> Strings = new ArrayList<String>();
				//String hola[] = br.readLine().split(",");
				//linea = hola[0] + hola[1];
				System.out.println("1: " + linea);
				
				/**
				 * leer el archivo
				 */
				int ref = 0;
				while((linea = br.readLine()) != null) {
					int h = linea.length();
					//System.out.println("no con to: " + linea);
					String p = linea.substring(1,h-1).toLowerCase();
					//System.out.println("prueba: " + p);
					String[] lineas = p.split(",");
					p = lineas[0];
					Strings.add(p);
					p = lineas[1];
					Strings.add(p);
					ref++;
				}

				br.close();
				fr.close();
				
				Scanner data = new Scanner(archivo_pal);
				String datos = data.nextLine().toLowerCase();
				System.out.println("------------------------");
				System.out.println("|        Inicio         |");
				System.out.println("------------------------");
				System.out.println("lo que desea traducir es lo siguiente: ");
				System.out.println(datos);
				String[] values = datos.split(" ");
				int cont = values.length;
				int var = Strings.size();
				
				
				lista3 = bmt.keys(Strings);
				System.out.println("-----------------------------------------");
				System.out.println("esta es la lista de llaves: " + lista3);
				
				lista4 = bmt.value(Strings);
				System.out.println("esta es la lista de valores: " + lista4);
				System.out.println("--------------------------------------------------");
				
				
				theMap = bmt.dicc(lista3, lista4, ref);
		
				System.out.println("El diccionario: " + theMap);
				System.out.println("--------------------------------------------------");
				System.out.println("");
				System.out.println("Su traduccion es la siguiente: ");
				System.out.println(bmt.answer(values, theMap));
				
				
				System.out.println("------------------------");
				System.out.println("|          FIN         |");
				System.out.println("------------------------");
			}catch(Exception e) {
				System.out.println("Error al leer el archivo");
			}
			
			
		}
		//Terminar programa	
	
	}

	

}

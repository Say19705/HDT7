/**
 * @author andres Say Agosto 19705
 * Clase de prueba
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;


import junit.framework.TestCase;
public class TestTreeMap extends TestCase{
	ArrayList<String> lista = new ArrayList<String>();
	ArrayList<String> lista2 = new ArrayList<String>();
	private BinaryTree Bt;
	

	/**
	 * inicializar la clase BinaryTree
	 */
	public void prueba() {
		Bt = new BinaryTree();
	}
	
	
	/**
	 * Prueba de metodos
	 */
	@SuppressWarnings({"unchecked"})
	public void testValues (){
		prueba();
		lista.add("hola");
		lista.add("adios");
		lista2.add("adios");
		assertEquals(lista2, Bt.value(lista));;
	}
	
}

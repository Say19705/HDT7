import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

/**
 * @author Andres Say Agosto 19705
 * Extraido de: Duane A Bailey (2007) java structures in java for principled programmer edición raiz 7
 */
public class BinaryTree<E>
{

    protected E val; // value associated with node
	protected BinaryTree<E> parent; // parent of node
	protected BinaryTree<E> left, right; // children of node
	List<String> lista = new ArrayList<String>();
	
	
	public BinaryTree()
	// post: constructor that generates an empty node
	{
		val = null;
		parent = null; left = right = this;
	}
	
	public BinaryTree(E value)
	// post: returns a tree referencing value and two empty subtrees
	{
		val = value;
		right = left = new BinaryTree<E>();
		setLeft(left);
		setRight(right);
	}
	
	private void setRight(BinaryTree<E> right2) {
		// TODO Auto-generated method stub
		
	}

	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
	// post: returns a tree referencing value and two subtrees
	{
		val = value;
		if (left == null) { left = new BinaryTree<E>(); }
		setLeft(left);
		if (right == null) { right = new BinaryTree<E>(); }
		setRight(right);
	}
	
	public BinaryTree<E> left()
	// post: returns reference to (possibly empty) left subtree
	// post: returns reference to (possibly empty) left subtree
	{
		return left;
	}
	
	public BinaryTree<E> parent() {
		return null;
	}
	// post: returns reference to parent node, or null
	
	public void setLeft(BinaryTree<E> newLeft)
	// post: sets left subtree to newLeft
	// re-parents newLeft if not null
	{
		if (isEmpty()) return;
		if (left != null && left.parent() == this) left.setParent(null);
		left = newLeft;
		left.setParent(this);
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void setParent(BinaryTree<E> newParent)
	// post: re-parents this node to parent reference, or null
	{
		if (!isEmpty()) {
		parent = newParent;
		}
	}
	

	public E value()
	// post: returns value associated with this node
	{
		return val;
	}
	
	public void setValue(E value)
	// post: sets the value associated with this node
	{
		val = value;
	}
	/**
	 * @param Strings el string que contiene todos los valores
	 * @return una lista solo de llaves
	 */
	public List<String> keys(ArrayList<String> Strings){
		int n = Strings.size();
		List<String> lista = new ArrayList<String>();
		for(int i = 0; i < n; i = i+2) {
			lista.add(Strings.get(i));
		}
		
		return lista;
		
	}
	
	/**
	 * @param Strings el string que contiene todos los valores 
	 * @return una lista de valores del diccionario
	 */
	public List<String> value(ArrayList<String> Strings){
		int n = Strings.size();
		List<String> lista = new ArrayList<String>();
		for(int i = 1; i<n; i = i +2) {
			lista.add(Strings.get(i));
		}
		return lista;
	}
	
	/**
	 * @param lista3 lista de llaves
	 * @param lista4 lista de valores 
	 * @param ref cantidad de valores en el diccionario
	 * @return el diccionario a utilizar
	 */
	public Map<String, String> dicc(List<String> lista3, List<String> lista4, int ref){
		Map<String, String> theMap = new Hashtable<String, String>();
		for(int i = 0; i < ref; i++) {
			theMap.put(lista3.get(i), lista4.get(i));
		}
		return theMap;
	}
	/**
	 * @param values el string con el texto
	 * @param theMap el diccionario
	 * @return la palabra traducida
	 */
	public String answer(String[] values, Map<String, String> theMap ) {
		String answer = "";
		String v = "";
		int cont = values.length;
		for(int i = 0; i < cont; i++) {
			boolean h = theMap.containsKey(values[i]);
			if(h == true) {
				v = theMap.get(values[i]);
			}
			else {
				v = ("*")+values[i]+("*");
			}
			answer = answer + (" ") + v;
		}
		
		return answer;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
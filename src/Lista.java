/**
 * @author Daniela
 *
 */
public class Lista {
	public Nodo raiz;

	/**
	 * @return the lista
	 */
	public Nodo getLista() {
		return raiz;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(Nodo raiz) {
		this.raiz = raiz;
	}

	
	/**
	 * @param lista
	 */
	public Lista(Nodo raiz) {
		this.raiz = raiz;
	}
	
	/**
	 * @param lista
	 */
	public Lista() {
		this.raiz = null;
	}
	
	/**
	 * La funcion verifica que la lista este vacía. Si la rama esta vacía. la lista esta vacia.
	 */
	public boolean esVacia(){
		 if (raiz != null){
			 return false;
		 }else{
			 return true;
		 } 
	}
	
	public void insertarAlPrincipio(Integer valorNuevo){
		Nodo nuevo=new Nodo(valorNuevo);
		nuevo.setValor(valorNuevo);
		if(this.esVacia()){
			raiz=nuevo;
		}
		else{
			nuevo.sig=raiz;
			raiz.sig=nuevo;
		}
	}

	
	public void eliminarElementoPrincipio(){
		Nodo cursor=raiz;
		raiz=cursor.sig;
	}
	
	public int at(int pos){
    	int i = 0;
    	int elem = -1;
    	Nodo aux = raiz;
    	while ((i < pos) && (aux != null)){
    		aux = aux.getSig();
    		i++;
    	}
    	if (aux != null){
    		elem = aux.getValor();
    	}
		return elem;
    }
	 	
}


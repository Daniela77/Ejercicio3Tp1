
/**
 * @author Daniela
 *
 */
public class Nodo {
	public Integer valor;
	public Nodo sig;

 public Nodo(Integer valor){
	 this.valor=valor;
	 this.sig=null;
 }
 
 public Nodo(){
	 this.valor=0;
	 this.sig=null;
 }
 
/**
 * @return the valor
 */
public Integer getValor() {
	return valor;
}

/**
 * @param valor the valor to set
 */
public void setValor(Integer valor) {
	this.valor = valor;
}


/**
 * @return the sig
 */
public Nodo getSig() {
	return sig;
}

/**
 * @param der the der to set
 */
public void setDer(Nodo sig) {
	this.sig = sig;
}


 
}


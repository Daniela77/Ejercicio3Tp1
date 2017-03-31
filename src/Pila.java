
public class Pila {
	public Lista pila;
	
	Pila(){
		this.pila=new Lista();
	}
	
	public boolean esPilaVacia(){
		 if (pila.esVacia()){
			 return true;
		 }else{
			 return false;
		 } 
	}
	
	public void agregarElemento(Integer v){
		pila.insertarAlPrincipio(v);	
	}
	
	public void EliminarElemento(){
		if (!(pila.esVacia())){
			pila.eliminarElementoPrincipio();
		}
	}
	
	public void mostrarTope(){
		int tope=pila.at(0);
			System.out.println("valor" + tope);	
	}
	
	
}

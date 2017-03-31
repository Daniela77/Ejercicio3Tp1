
public class MainPila {

	public static void main(String[] args) {
		Pila p = new Pila();
		Integer valor1=3;
		Integer valor2=4;
	    System.out.println( "Insertando los siguientes valores: ");
	    System.out.println("valor:"+valor1);
	    p.agregarElemento(valor1);
	    p.mostrarTope();
	    p.agregarElemento(valor2);
	    p.mostrarTope();
	    p.EliminarElemento();
	    p.mostrarTope();
	    
	}

}

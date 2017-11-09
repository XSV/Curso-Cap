package contenedores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> integerBox;
		
		integerBox = new Box<>();
		
		integerBox.setT(1);
		integerBox.setT(2);
	}
//Crear objetos de tipo pareja (Clase Interface Pair)
	Pair<String, Integer> p1;
	Pair<String, String> p2;
	
	
	p1 = new OrderedPair<>("hola", 1);
	p2 = new OrderedPair<>("Juan", "RRHH");
}
}

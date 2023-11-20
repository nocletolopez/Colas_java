package Clase_Estructuras;

public class Universidades_colas {

	private Node raiz, aux;

	public class Node {

		String nombre, carrera, costo;
		Node siguiente;

	}

	public Universidades_colas() {
		// raiz y aux deben apuntar a null
		raiz = null;
		aux = null;

	}

	// Insertar el nodo
	public void insertar_nodo(String M, String N, String E) {

		Node nuevo = new Node();
		nuevo.nombre = M;
		nuevo.carrera= N;
		nuevo.costo = E;
		nuevo.siguiente = null;

		if (raiz == null) {

			raiz = nuevo;
			aux = nuevo;

		} else {

			aux.siguiente = nuevo;
			aux = nuevo;

		}

	}

	public void eliminar_nodos() {

		if (raiz != null) {

			String a = raiz.nombre;
			String b = raiz.costo;
			String c = raiz.carrera;
			System.out.println("La info a elminar es: \n--> " + a + "\n--> " + b + "\n--> " + c);

			if (raiz == aux) {

				aux = null;
				raiz = null;

			} else {

				raiz = raiz.siguiente;
			}

		} else {

			System.out.println("No hay datos en la cola");

		}

	}

	public void mostrar_nodos() {

		Node informacion = raiz;
		int x = 0;

		while (informacion != null) {

			System.out.println("La informacion que contiene el nodo " + x + " es: "
					+ informacion.nombre + "\n" + informacion.costo + "\n" + informacion.carrera);
			x++;
			informacion = informacion.siguiente;
		}

	}

	public static void main(String[] args) {

		Universidades_colas nodos = new Universidades_colas();

		nodos.insertar_nodo("Jairo", "Ing Civil", "5300200");
		nodos.insertar_nodo("Camila", "Administracion", "6000000");
		nodos.insertar_nodo("Eva", "Musica", "3500000");
		nodos.mostrar_nodos();

		nodos.eliminar_nodos();
		nodos.mostrar_nodos();

	}

}

	
	



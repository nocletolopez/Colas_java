package Clase_Estructuras;

public class Main {

	private Node raiz, aux;

	public class Node {

		String nombre;
		Node siguiente;

	}

	public Main() {
		// raiz y aux deben apuntar a null
		raiz = null;
		aux = null;

	}

	// Insertar el nodo
	public void insertar_nodo(String M) {

		Node nuevo = new Node();
		nuevo.nombre = M;
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
			System.out.println("La info a eliminar es: " + a);

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

			System.out.println("La informacion que contiene el nodo " + x + " es: " + informacion.nombre);
			x++;
			informacion = informacion.siguiente;
		}

	}

	public static void main(String[] args) {

		Main nodos = new Main();

		nodos.insertar_nodo("Nodo #1");
		nodos.insertar_nodo("Nodo #2");
		nodos.insertar_nodo("Nodo #3");
		nodos.mostrar_nodos();

		nodos.eliminar_nodos();
		nodos.mostrar_nodos();

	}

}

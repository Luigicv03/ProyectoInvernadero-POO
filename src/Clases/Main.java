package Clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Categoria BD = new Categoria();
		
		int opcion;
		int regreso = 2;
		Scanner Leer = new Scanner(System.in);
		do {
		System.out.println("----------------------------");
		System.out.println("Bienvenido al invernadero");
		System.out.println("1.-Agregar una Hierba");
		System.out.println("2.-Agregar un Arbol");
		System.out.println("3.-Agregar un Cactus");
		System.out.println("4.-Agregar una Orquidea");
		System.out.println("5.-Ver lista de Plantas");
		opcion = Leer.nextInt();
		
		String Nombre;
		String Origen;
		String Color;
		
		switch(opcion) {
		case 1:
			///Hierba
			System.out.println("Cual es el Nombre");
			Nombre = Leer.next();
			System.out.println("Cual es el Origen");
			Origen = Leer.next();
			System.out.println("Cual es el Color");
			Color = Leer.next();
			System.out.println("Cual es el fruto yema");
			String FrutoYema= Leer.next();
			System.out.println("Cual es la forma de la hoja");
			String FormaHoja = Leer.next();
			System.out.println("Cual es el Tipo de tallo");
			String TipoTallo = Leer.next();

			Hierba NuevaHierba = new Hierba(Nombre,Origen, Color, FrutoYema, FormaHoja,TipoTallo);
			BD.AgregarHierba(NuevaHierba);
			break;
		case 2:
			///Arbol
			System.out.println("Cual es el Nombre");
			Nombre = Leer.next();
			System.out.println("Cual es el Origen");
			Origen = Leer.next();
			System.out.println("Cual es el Color");
			Color = Leer.next();
			System.out.println("Cual es el Tipo de Madera");
			String TipoMadera= Leer.next();
			System.out.println("Cual es la Altura en centimetros");
			int Altura = Leer.nextInt();
			System.out.println("Cual es el fruto");
			String Fruto = Leer.next();

			Arbol NuevoArbol = new Arbol(Nombre,Origen, Color, TipoMadera, Altura,Fruto);
			BD.AgregarArbol(NuevoArbol);
			break;
		case 3:
			///Cactus
			System.out.println("Cual es el Nombre");
			Nombre = Leer.next();
			System.out.println("Cual es el Origen");
			Origen = Leer.next();
			System.out.println("Cual es el Color");
			Color = Leer.next();
			System.out.println("Cual es la forma");
			String Forma= Leer.next();
			System.out.println("Cual es el tipo de espina");
			String TipoEspina = Leer.next();
			System.out.println("Tiene alguna flor?");
			String Flor = Leer.next();

			Cactus NuevoCactus = new Cactus(Nombre,Origen, Color, Forma, TipoEspina,Flor);
			BD.AgregarCactus(NuevoCactus);
			break;
		case 4:
			///Orquidea
			System.out.println("Cual es el Nombre");
			Nombre = Leer.next();
			System.out.println("Cual es el Origen");
			Origen = Leer.next();
			System.out.println("Cual es el Color");
			Color = Leer.next();
			System.out.println("Cual es el Tipo de Orquidea");
			String TipoOrquidea= Leer.next();
			System.out.println("Cual es el tipo de petalo");
			String TipoPetalo = Leer.next();
			System.out.println("Cual es el tipo de polinio");
			String Polinio = Leer.next();

			Orquidea NuevoOrquidea = new Orquidea(Nombre,Origen, Color, TipoOrquidea, TipoPetalo,Polinio);
			BD.AgregarOrquidea(NuevoOrquidea);
			break;
		case 5:
			System.out.println("A seccion desea ingresar");
			System.out.println("1.-Hierba");
			System.out.println("2.-Arbol");
			System.out.println("3.-Cactus");
			System.out.println("4.-Orquidea");
			int Seleccion = Leer.nextInt();
			BD.ObtenerLista(Seleccion);
			break;
		default:
			System.out.println("Ingresa una opcion valida");
			break;
		
			}System.out.println("Desea regresar al menu principal\n 1.Si \t 2.No");
			regreso = Leer.nextInt();
		}while(regreso!=2);
		System.out.println("Gracias por utilizar el invernadero");
	}

}

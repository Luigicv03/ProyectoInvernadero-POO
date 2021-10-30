package Clases;

import java.util.*;

public class Categoria {

	public List<Hierba> ListaHierbas= new ArrayList<Hierba>();
	public List<Arbol> ListaArboles= new ArrayList<Arbol>();
	public List<Cactus> ListaCactus= new ArrayList<Cactus>();
	public List<Orquidea> ListaOrquidea= new ArrayList<Orquidea>();
	
	public Categoria() {
	}
	public void AgregarHierba(Hierba Planta) {
		this.ListaHierbas.add(Planta);
	}
	public void AgregarArbol(Arbol Planta) {
		this.ListaArboles.add(Planta);
	}
	public void AgregarCactus(Cactus Planta) {
		this.ListaCactus.add(Planta);
	}
	public void AgregarOrquidea(Orquidea Planta) {
		this.ListaOrquidea.add(Planta);
	}
	public void ObtenerLista(int Lista){
		
		switch(Lista) {
		case 1:
			System.out.println("----------------------------");
			System.out.println("Cantidad de HIERBAS"+ "\t" + ListaHierbas.size());
			System.out.println("----------------------------");
			for(int i =0;i<ListaHierbas.size();i++) {
				System.out.println("Hierba#" + i);
				String Mensaje = ListaHierbas.get(i).ObtenerHierba();
				System.out.println(Mensaje);
				System.out.println("----------------------------");
			}
			break;
		case 2:
			System.out.println("----------------------------");
			System.out.println("Cantidad de ARBOLES"+ "\t" + ListaArboles.size());
			System.out.println("----------------------------");
			for(int i =0;i<ListaArboles.size();i++) {
				System.out.println("Arbol#"+ i);
				String Mensaje = ListaArboles.get(i).ObtenerArbol();
				System.out.println(Mensaje);
				System.out.println("----------------------------");
			}
			break;
		case 3:
			System.out.println("----------------------------");
			System.out.println("Cantidad de CACTUS"+ "\t" + ListaCactus.size());
			System.out.println("----------------------------");
			for(int i =0;i<ListaCactus.size();i++) {
				System.out.println("Cactus#"+ i);
				String Mensaje = ListaCactus.get(i).ObtenerCactus();
				System.out.println(Mensaje);
				System.out.println("----------------------------");
		}
		break;
		case 4:
			System.out.println("----------------------------");
			System.out.println("Cantidad de ORQUIDEAS"+ "\t" + ListaOrquidea.size());
			System.out.println("----------------------------");
			for(int i =0;i<ListaOrquidea.size();i++) {
				System.out.println("Orquidea#"+ i);
				String Mensaje = ListaOrquidea.get(i).ObtenerOrquidea();
				System.out.println(Mensaje);
				System.out.println("----------------------------");
		}
		break;
		
		
	}
	}
}

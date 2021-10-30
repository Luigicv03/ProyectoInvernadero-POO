package Clases;

public class Arbol extends ClasePlanta {
	
	public String TipoMadera;
	public int Altura;
	public String Fruto;
	
	public Arbol(String Nombre, String Origen, String Color, String TipoMadera, int Altura, String Fruto) {
		super(Nombre, Origen, Color);
		this.TipoMadera = TipoMadera;
		this.Altura = Altura;
		this.Fruto = Fruto;
		}
	public String ObtenerArbol(){
		return "Nombre:" + " " + Nombre + "\n" + "Origen:" + " " + Origen +"\n" + "Color:" + " " + Color +"\n" + "Tipo de madera:" + " " + TipoMadera +"\n" + "La Altura es:" + " " + Altura+"\n" + "Fruto:" + " " + Fruto;
	}
}

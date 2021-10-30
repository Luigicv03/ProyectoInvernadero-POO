package Clases;

public class Hierba extends ClasePlanta {
	
	
	public String FrutoYema;
	public String FormaHoja;
	public String TipoTallo;
	
	public Hierba(String Nombre,String Origen,String Color, String FrutoYema, String FormaHoja, String TipoTallo) {
	super(Nombre, Origen, Color);
	this.FrutoYema = FrutoYema;
	this.FormaHoja = FormaHoja;
	this.TipoTallo = TipoTallo;
	}
	public String ObtenerHierba(){
		return "Nombre:" + " " + Nombre + "\n" + "Origen:" + " " + Origen +"\n" + "Color:" + " " + Color +"\n" + "Fruto Yema:" + " " + FrutoYema +"\n" + "Forma Hoja:" + " " + FormaHoja +"\n" + "Tipo Tallo:" + " " + TipoTallo;
	}
}

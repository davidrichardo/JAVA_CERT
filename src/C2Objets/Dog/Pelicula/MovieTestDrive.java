package C2Objets.Dog.Pelicula;

class Pelicula{
 String titulo;
 String genero;
 int calificacion;
 
 void playIt(){
 	System.out.println("Reproduciendo pelicula: " + titulo);
 }
}

public class MovieTestDrive{
	public static void main(String[] args){
		Pelicula uno = new Pelicula();
		uno.titulo ="Piratas del Caribe";
		uno.genero = "Accion";
		uno.calificacion = 9;
		uno.playIt();
		
		Pelicula dos = new Pelicula();
		dos.titulo = "Flow";
		dos.genero ="Infantil";
		dos.calificacion = 8;
		dos.playIt();
		
	}
}
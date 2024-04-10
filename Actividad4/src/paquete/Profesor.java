package paquete;

public class Profesor {
	
	//Métodos
	//pone las notas de manera aleatoria
	public static void ponerNotas(Alumno al) {
		
		Asignatura a;
		Asignatura b;
		Asignatura c;
		
		a = al.getLengua();
		a.setCalif(Math.random()*10);
		
		b = al.getMates();
		b.setCalif(Math.random()*10);
		
		c = al.getProgramacion();
		c.setCalif(Math.random()*10);
		
	}
	
	//calcula la media a partir de la nota
	public static double calcularMedia(Alumno al) {
		
		Asignatura a;
		Asignatura b;
		Asignatura c;
		double n1;
		double n2;
		double n3;
		double media;
		
		a = al.getLengua();
		n1 = a.getCalif();
		
		b = al.getMates();
		n2 = b.getCalif();
		
		c = al.getProgramacion();
		n3 = c.getCalif();
		
		media = (n1+n2+n3)/3;
		
		return media;
	}


}

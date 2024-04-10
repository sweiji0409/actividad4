package paquete;

public class Asignatura {


	// Atributos
	private int id;
	private double calificacion;
	
	// Constructores
	public Asignatura() {
		id = 0;
		calificacion = 0.0;
	}
	
	
	public Asignatura(int id) {
		this.id = id;
		calificacion = 0.0;
	}
	
	// Métodos
	public int getId() {
		return id;
	}
	
	public double getCalif() {
		return calificacion;
	}
	
	public void setCalif(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
}

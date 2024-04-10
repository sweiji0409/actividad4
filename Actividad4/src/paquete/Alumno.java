package paquete;

public class Alumno {
	
	// Atributos
	private Asignatura mates;
	private Asignatura lengua;
	private Asignatura programacion;
	
	// Constructores
	Alumno(int id1, int id2, int id3){
		this.lengua = new Asignatura(id1);
		mates = new Asignatura(id2);
		programacion = new Asignatura(id3);
	}
	
	Alumno(Asignatura a1, Asignatura a2, Asignatura a3){
		this.lengua = a1;
		this.mates = a2;
		this.programacion = a3;
	}

	
	//Métodos
	// Getters de cada una de las asignaturas
	public Asignatura getMates() {
		return mates;
	}

	public Asignatura getLengua() {
		return lengua;
	}


	public Asignatura getProgramacion() {
		return programacion;
	}

}

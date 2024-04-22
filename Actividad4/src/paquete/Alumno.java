package paquete;

public class Alumno {
	
	// Atributos
	private Asignatura mates;
	private Asignatura lengua;
	private Asignatura programacion;
	//Añadimos los atributos en la rama issue1
	private String nombre;
	private int anio_nac;
	private String dni;
	
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

	Alumno(Asignatura a1, Asignatura a2, Asignatura a3, String nombre, int anio, String dni){
		this.lengua = a1;
		this.mates = a2;
		this.programacion = a3;
		this.nombre = nombre;
		this.anio_nac = anio;
		if(dni.length() != 9)
			this.dni = "";
		else
			this.dni = dni;
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

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio_nac;
	}

	public String getDNI() {
		return dni;
	}

}

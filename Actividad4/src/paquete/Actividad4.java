package paquete;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Creamos las asignaturas
		Asignatura lengua = new Asignatura(1);
		Asignatura mates = new Asignatura(2);
		Asignatura programacion = new Asignatura(3);
		
		//Creamos los alumnos
		Alumno pepe = new Alumno(lengua, mates, programacion, "Pepe Rueda", 2003, "W12345678");
		
		Profesor.ponerNotas(pepe);
		System.out.println("Informacion acerca del alumnado: " + 
				    "\nNombre: " + pepe.getNombre() +
				   "\nAnio de nacimiento: " + pepe.getAnio() +
				   "\nDNI: " + pepe.getDNI());
		System.out.println("Media de pepe : " + Profesor.calcularMedia(pepe));
		System.out.println("\nLengua: " + pepe.getLengua().getCalif() 
							+ "\nMates: " + pepe.getMates().getCalif() 
							+ "\nProgramacion: " + pepe.getProgramacion().getCalif());

	}

}

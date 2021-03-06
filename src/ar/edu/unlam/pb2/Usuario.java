package ar.edu.unlam.pb2;


public class Usuario implements Kanban{
	
	private String nombreDeUsuario;
	private String contraseņa;

	public Usuario ( String nombreDeUsuario, String contraseņa) {
		this.nombreDeUsuario=nombreDeUsuario;
		this.contraseņa=contraseņa;
	}

	public Tarea crearTareas(String titulo, String actividad) {
		Tarea primerTarea = new Tarea(titulo, actividad );
		return primerTarea;
	}
	
	public Boolean modificarTarea(Tarea tareaAModificar, String nuevoTitulo, String NuevoActividad) {

		return tareaAModificar.modificarTarea(tareaAModificar,  nuevoTitulo,  NuevoActividad);
		
	}
	
	public Boolean finalizarTarea(Tarea tareaAFinalizar) {

		return tareaAFinalizar.finalizarTarea(tareaAFinalizar);
		
	}

}

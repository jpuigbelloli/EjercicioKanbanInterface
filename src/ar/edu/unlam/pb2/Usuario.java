package ar.edu.unlam.pb2;


public class Usuario implements Kanban{
	
	private String nombreDeUsuario;
	private String contrase�a;

	public Usuario ( String nombreDeUsuario, String contrase�a) {
		this.nombreDeUsuario=nombreDeUsuario;
		this.contrase�a=contrase�a;
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

package ar.edu.unlam.pb2;

public interface Kanban {
	
	public abstract Tarea crearTareas(String titulo, String actividad);
	
	public abstract Boolean modificarTarea(Tarea tareaAModificar, String nuevoTitulo, String nuevaActividad);
	
	public abstract Boolean finalizarTarea(Tarea tareaAFinalizar);

}

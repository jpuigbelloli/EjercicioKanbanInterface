package ar.edu.unlam.pb2;

public class Tarea {
	private String actividad;
	private String titulo;
	private Estado estadoDeLaTarea;

	public Tarea(String titulo, String actividad) {
		this.titulo=titulo;
		this.actividad=actividad;
		this.estadoDeLaTarea= Estado.PENDIENTE;
	}
	
	private Estado getEstadoDeLaTarea() {
		return estadoDeLaTarea;
	}

	public Estado getEstado(Tarea tarea) {
		return tarea.getEstadoDeLaTarea();
	}

	public Boolean modificarTarea(Tarea tarea, String nuevoTitulo, String nuevoActividad) {
		return tarea.setEstado(tarea,  nuevoTitulo,  nuevoActividad);
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private Boolean setEstado(Tarea tarea, String nuevoTitulo, String nuevoActividad) {
		if(tarea.getEstado(tarea).equals(Estado.PENDIENTE)) {
			tarea.setTitulo(nuevoTitulo);
			tarea.setActividad(nuevoActividad);
			tarea.setEstadoDeLaTarea(Estado.EN_CURSO);
			return true;
		}else return false;
	}

	public void setEstadoDeLaTarea(Estado estadoDeLaTarea) {
		this.estadoDeLaTarea = estadoDeLaTarea;
	}

	public Boolean finalizarTarea(Tarea tareaAFinalizar) {
		if(tareaAFinalizar.getEstado(tareaAFinalizar).equals(Estado.PENDIENTE)) {
			tareaAFinalizar.setEstadoDeLaTarea(Estado.FINALIZADA);
			return true;
		}else return false;
	}


}

package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class KanbanTest {

	@Test
	public void queSePuedaCrearUnUsuario() {
		Usuario german = new Usuario("German", "Contraseña1234");
		
		assertNotNull(german);
	}
	
	@Test
	public void queUsuarioPuedaCrearTareas() {
		Usuario german = new Usuario("German", "Contraseña1234");
			
		assertNotNull(german.crearTareas("Mi primer tarea","Modificar el Head"));
	}

	@Test
	public void queAlCrearTareasSuEstadoSeaPendiente() {
		Usuario german = new Usuario("German", "Contraseña1234");
			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		Estado ESTADO_ESPERADO = Estado.PENDIENTE;
		
		assertEquals(ESTADO_ESPERADO, nuevaTarea.getEstado(nuevaTarea));
	}
	
	
	@Test
	public void queSePuedaModificarUnaTarea() {
		Usuario german = new Usuario("German", "Contraseña1234");
			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		assertTrue(german.modificarTarea(nuevaTarea,"Mi primer tarea", "Nuevo contenido"));
	}
	
	@Test
	public void queAlModificarUnaTareaSuEstadoSeaEnCurso() {
		Usuario german = new Usuario("German", "Contraseña1234");
			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		
		german.modificarTarea(nuevaTarea, "Mi primer tarea", "actividad en curso");
		
		Estado ESTADO_ESPERADO = Estado.EN_CURSO;
		assertEquals(ESTADO_ESPERADO, nuevaTarea.getEstado(nuevaTarea));
	}

	@Test
	public void queUnaTareaEnCursoNoSePuedaModificar() {
		Usuario german = new Usuario("German", "Contraseña1234");
		Usuario gustavo = new Usuario("Gustavo", "0000");
		Usuario rosa = new Usuario("rosa", "555");
			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		gustavo.modificarTarea(nuevaTarea, "Mi primer tarea", "Ya termine el Head falta el Footer");
		
		assertFalse(rosa.modificarTarea(nuevaTarea, "quiero modificarla", "y no puedo"));
	}
	
	@Test
	public void queUnaTareaSePuedaFinalizarSiEstaPendiente() {
		Usuario german = new Usuario("German", "Contraseña1234");
			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		
		assertTrue(german.finalizarTarea(nuevaTarea));
		
	}
	
	@Test
	public void queUnaTareaNoSePuedaFinalizarSiEstaEnCurso() {
		Usuario german = new Usuario("German", "Contraseña1234");
		Usuario gustavo = new Usuario("Gustavo", "0000");

			
		Tarea nuevaTarea = german.crearTareas("Mi primer tarea","Modificar el Head");
		gustavo.modificarTarea(nuevaTarea, "Mi primer tarea", "Ya termine el Head falta el Footer");

		
		assertFalse(german.finalizarTarea(nuevaTarea));
		
	}
}

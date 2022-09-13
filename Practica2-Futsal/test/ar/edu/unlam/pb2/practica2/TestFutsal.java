package ar.edu.unlam.pb2.practica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFutsal {

	@Test
	public void queSePuedaAgregarUnJugadorAlEquipo() {
		//Preparacion
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		
		//ejecucion
		assertTrue(equipo.agregarJugador(jugador));
	}
	
	
	@Test
	public void queNoSePuedaAgregarUnJugadorAlEquipo() {
		//Preparacion
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Integer numero1= 1;
		String nombre1="Nicolas";
		Integer edad1=24;
		Double precio1=820000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		Jugador jugador1= new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		assertTrue(equipo.agregarJugador(jugador1));
	}
	
	@Test
	public void queSePuedaCalcularElValorDelEquipo() {
		//Preparacion
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Integer numero1= 7;
		String nombre1="Nicolas";
		Integer edad1=24;
		Double precio1=280000.00;
		Double total=1130000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		Jugador jugador1= new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		assertEquals(total,equipo.calcularElValorDelEquipo(),00.00);
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDelEquipo() {
		//Preparacion
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Integer numero1= 7;
		String nombre1="Nicolas";
		Integer edad1=24;
		Double precio1=280000.00;
		Double edadTotal=24.5;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		Jugador jugador1= new Jugador(numero1,nombre1,edad1,precio1);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		equipo.agregarJugador(jugador1);
		assertEquals(edadTotal,equipo.calcularLaEdadPromedioDelEquipo(),00.00);
	}
	
	@Test
	public void queSePuedaMarcarUnGol() {
		
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		EquipoDeFutbol equipo1=new EquipoDeFutbol("Colombia");
		PartidoDeFutbol partido=new PartidoDeFutbol(equipo,equipo1);
		TipoDeEvento evento;
		evento=TipoDeEvento.GOL_A_FAVOR;
		Evento gol=new Evento(25,jugador,evento);
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		assertEquals(1,partido.marcar(gol));
		
		
		
	}
	
	@Test
	public void queSePuedaAmonestarAUnJugador() {
		
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		EquipoDeFutbol equipo1=new EquipoDeFutbol("Colombia");
		PartidoDeFutbol partido=new PartidoDeFutbol(equipo,equipo1);
		TipoDeEvento evento;
		evento=TipoDeEvento.AMONESTACION;
		Evento amonestacion=new Evento(25,jugador,evento);
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		assertEquals(1,partido.amonestar(amonestacion));
		
	}
	
	
	@Test
	public void queSePuedaExpulsarAUnJugador() {
		
		Integer numero= 1;
		String nombre="Gaspar";
		Integer edad=25;
		Double precio=850000.00;
		Jugador jugador= new Jugador(numero,nombre,edad,precio);
		EquipoDeFutbol equipo=new EquipoDeFutbol("Argentina");
		EquipoDeFutbol equipo1=new EquipoDeFutbol("Colombia");
		PartidoDeFutbol partido=new PartidoDeFutbol(equipo,equipo1);
		TipoDeEvento evento;
		evento=TipoDeEvento.AMONESTACION;
		Evento amonestacion=new Evento(25,jugador,evento);
		Evento amonestacion1=new Evento(40,jugador,evento);
		
		//Ejecucion
		equipo.agregarJugador(jugador);
		partido.amonestar(amonestacion);
		assertTrue(partido.expulsar(amonestacion1));
		
	}
}

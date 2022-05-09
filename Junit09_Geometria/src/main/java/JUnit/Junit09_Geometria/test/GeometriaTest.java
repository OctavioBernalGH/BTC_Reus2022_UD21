package JUnit.Junit09_Geometria.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * @author OctavioBernalGH
 * @version 0.0.1
 * @date 09/05/2022
 *
 */
class GeometriaTest {

	@Test
	public void CreacionObjetotest() {

		// Creación objetos para comprobar constructor
		Geometria GeoTest1 = new Geometria(1);
		Geometria GeoTest2 = new Geometria(2);
		Geometria GeoTest3 = new Geometria(3);
		Geometria GeoTest4 = new Geometria(4);
		Geometria GeoTest5 = new Geometria(5);
		Geometria GeoTest6 = new Geometria(6);
		Geometria GeoTest7 = new Geometria(7);
		Geometria GeoTest8 = new Geometria(8);
		Geometria GeoTestDefault = new Geometria(100);
		Geometria GeoTestVacio = new Geometria();

		// Se imprime el objeto
		System.out.println(GeoTest1);
		System.out.println(GeoTest2);
		System.out.println(GeoTest3);
		System.out.println(GeoTest4);
		System.out.println(GeoTest5);
		System.out.println(GeoTest6);
		System.out.println(GeoTest7);
		System.out.println(GeoTest8);
		System.out.println(GeoTestDefault);
		System.out.println(GeoTestVacio);

		// Se compara el valor de la variable Nom con el introducido manualmente.
		String esperado = "cuadrado";
		assertEquals(esperado, GeoTest1.getNom());
		esperado = "Circulo";
		assertEquals(esperado, GeoTest2.getNom());
		esperado = "Triangulo";
		assertEquals(esperado, GeoTest3.getNom());
		esperado = "Rectangulo";
		assertEquals(esperado, GeoTest4.getNom());
		esperado = "Pentagono";
		assertEquals(esperado, GeoTest5.getNom());
		esperado = "Rombo";
		assertEquals(esperado, GeoTest6.getNom());
		esperado = "Romboide";
		assertEquals(esperado, GeoTest7.getNom());
		esperado = "Trapecio";
		assertEquals(esperado, GeoTest8.getNom());
		esperado = "Default";
		assertEquals(esperado, GeoTestDefault.getNom());
		esperado = "Default";
		assertEquals(esperado, GeoTestVacio.getNom());
	}

	@Test
	public void testToString() {
		// Se crea una instancia de la clase Geometria para acceder a sus métodos y
		// atributos.
		Geometria geometria = new Geometria();
		// Se settean valores.
		geometria.setArea(1.1);
		geometria.setId(1);
		geometria.setArea(2.2);
		geometria.setNom("dodecaedro");
		// Se genera una cadena
		String esperado = "Geometria [id=" + 1 + ", nom=" + "dodecaedro" + ", area=" + 2.2 + "]";
		;
		// Se compara la cadena creada con la esperada.
		assertEquals(esperado, geometria.toString());
	}

	@Test
	public void testAreaCuadrado() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envía por parámetro el número 5.
		int resultado = GeoTest.areacuadrado(5);
		int esperado = 25;
		// Mediante el assertEquals validamos que el resultado sea el esperado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaCirculo() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envía por parámetro el número 5.
		double resultado = GeoTest.areaCirculo(5);
		double esperado = 78.53999999999999;
		// Mediante el assertEquals validamos que el resultado sea el esperado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTriangulo() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se le envía por parámetro 10 y 10.
		double resultado = GeoTest.areatriangulo(10, 10);
		double esperado = 50;
		// Sabiendo el resultado se compara con el esperado mediante assertEquals.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRectangulo() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envían dos parámetros, 10 y 5.
		double resultado = GeoTest.arearectangulo(10, 5);
		// Sabiendo que el resultado es 50, lo comprobamos con el retornado por la
		// función.
		double esperado = 50;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaPentagono() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envían dos parámetros, 10 y 2.
		double resultado = GeoTest.areapentagono(10, 2);
		double esperado = 10;
		// Sabiendo que el resultado es 10 lo comprobamos con el retornado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRombo() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envían dos parámetros, 10 y 2.
		double resultado = GeoTest.arearombo(10, 2);
		double esperado = 10;
		// Sabiendo que el resultado es 10 lo comprobamos con el retornado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaRomboide() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envían dos parámetros, 5 y 2.
		double resultado = GeoTest.arearomboide(5, 2);
		double esperado = 10;
		// Sabiendo que el resultado es 10 lo comprobamos con el retornado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testAreaTrapecio() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Se llama a la función y se envían tres parámetros, 5,5 y 5.
		double resultado = GeoTest.areatrapecio(5, 5, 5);
		double esperado = 25;
		// Sabiendo que el resultado es 10 lo comprobamos con el retornado.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testSetGetId() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Setteamos de forma manual un valor.
		GeoTest.setId(5);
		// Mediante el assertEquals verificamos tanto el set como el get.
		assertEquals(5, GeoTest.getId());
	}

	@Test
	public void testSetGetNombre() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Setteamos de forma manual un valor.
		GeoTest.setNom("Cuadrado");
		// Mediante el assertEquals verificamos tanto el set como el get.
		assertEquals("Cuadrado", GeoTest.getNom());
	}

	@Test
	public void testSetGetArea() {
		// Se crea el objeto para realizar el testing.
		Geometria GeoTest = new Geometria();
		// Setteamos de forma manual un valor.
		GeoTest.setArea(5);
		// Mediante el assertEquals verificamos tanto el set como el get.
		assertEquals(5, GeoTest.getArea());
	}
}

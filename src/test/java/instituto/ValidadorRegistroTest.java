package instituto;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ValidadorRegistroTest
{


    // Preparamos la herramienta de validación para las pruebas
    ValidadorRegistro validador = new ValidadorRegistro();


    @Test
    @DisplayName("Prueba: Un nombre normal debe funcionar")
    public void testNombreValido()
    {
        // Probamos con un nombre estándar
        boolean chequeo = validador.validarNombre("Carlos");


        // Confirmamos que el sistema lo acepta correctamente
        assertTrue(chequeo, "El validador no aceptó un nombre que es correcto");
    }


    @Test
    @DisplayName("Reto 1: Comprobar nombre en blanco")
    public void testNombreVacio()
    {
        boolean esInvalido = validador.validarNombre("");
        assertFalse(esInvalido, "El sistema permitió un nombre sin contenido");
    }


    @Test
    @DisplayName("Reto 2: Contraseña con el mínimo (8)")
    public void passwordJusta()
    {
        boolean esSuficiente = validador.validarPassword("12345678");
        assertTrue(esSuficiente, "La contraseña de 8 caracteres debería ser válida");
    }


    @Test
    @DisplayName("Reto 3: Contraseña por debajo del límite")
    public void passwordCorta()
    {
        boolean esCorta = validador.validarPassword("Admin");
        assertFalse(esCorta, "Se aceptó una clave demasiado breve");
    }


    @Test
    @DisplayName("Reto 4: Correo con formato erróneo")
    public void emailSinArroba()
    {
        boolean faltaArroba = validador.validarEmail("usuario.gmail.com");
        assertFalse(faltaArroba, "El sistema no detectó que falta la @ en el email");
    }


    @Test
    @DisplayName("Reto 5: Usuario con 16 años exactos")
    public void edadLimite()
    {
        boolean tieneEdadMinima = validador.validadEdad(16);
        assertTrue(tieneEdadMinima, "El sistema debería dejar pasar a alguien de 16 años");
    }


}


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sn.isi.Main;

public class MainTest {

    @Test
    public void testFactorielle() {
        // Given
        int nombre = 4;
        int Factorielle = 24;

        // When
        int resultat = Main.factorielle(nombre);

        // Then
        assertEquals(Factorielle, resultat);
    }

    @Test
    public void testFactorielleZero() {
        // Given
        int nombre = 0;
        int Factorielle = 1;

        // When
        int resultat = Main.factorielle(nombre);

        // Then
        assertEquals(Factorielle, resultat);
    }

    @Test
    public void testFactorielleUn() {
        // Given
        int nombre = 1;
        int Factorielle = 1;

        // When
        int resultat = Main.factorielle(nombre);

        // Then
        assertEquals(Factorielle, resultat);
    }
}
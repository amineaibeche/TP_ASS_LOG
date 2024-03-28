package testExample;
import exo_example.MaClass;
import exo_example.Mainterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MaClassTest {
    @Test
    void monTest() {
        // Arrange
        Mainterface maMock = mock(Mainterface.class);
        when(maMock.MaMethode()).thenReturn("mock");
        MaClass maClasse = new MaClass(maMock);
        // Act
        String resultat = maClasse.MaMethode();
        // Assert
        Assertions.assertEquals("mock", resultat);
    }

}

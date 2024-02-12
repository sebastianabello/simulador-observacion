import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class labTest {
    public static final Logger logger = LoggerFactory.getLogger(labTest.class);
    @Test
    public void canarioTest(){
        Canario canario = new Canario();
        Assert.assertNotNull(canario);

        logger.debug("Canario realiza vuelo");
        System.out.println("Canario realiza vuelo");
        canario.realizaVuelo();
        logger.debug("Canario realiza sonido");
        System.out.println("Canario realiza sonido");
        canario.realizaSonido();
        System.out.println("canario cambiando sonido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("Canario realiza sonido");
        canario.realizaSonido();
    }
}

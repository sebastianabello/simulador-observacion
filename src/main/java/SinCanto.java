import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinCanto implements TipoSonido {
    public static final Logger logger = LoggerFactory.getLogger(SinCanto.class);
    public void makeSound() {
        logger.debug("Silencio");
        System.out.println("Silencio");
    }
}

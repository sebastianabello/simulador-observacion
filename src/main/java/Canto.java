import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Canto implements TipoSonido {
    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    public void makeSound() {
        logger.debug("Cantando");
        System.out.println("Cantando");
    }
}

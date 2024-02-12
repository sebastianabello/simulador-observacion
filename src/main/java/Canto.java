import java.util.logging.Logger;

public class Canto implements TipoSonido {
    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    public void makeSound() {
        logger.info("Cantando");
        System.out.println("Cantando");
    }
}

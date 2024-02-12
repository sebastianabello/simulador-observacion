import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VueloConAlas implements TipoVuelo{
    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
    public void vuelo() {
        logger.debug("Volando con alas");
        System.out.println("Volando con alas");
    }
}

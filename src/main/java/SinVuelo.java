import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinVuelo implements TipoVuelo {
    public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);
    public void vuelo() {
        logger.debug("No puedo volar");
        System.out.println("No puedo volar");
    }
}

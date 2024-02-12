import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Canario extends Ave {
    public static final Logger logger = LoggerFactory.getLogger(Canario.class);
    public Canario() {
        logger.debug("Creando canario");
        this.setTipoSonido(new Canto());
        this.setTipoVuelo(new VueloConAlas());
    }

}

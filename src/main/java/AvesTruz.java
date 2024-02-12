import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class AvesTruz extends Ave{
   public static final Logger logger = LoggerFactory.getLogger(AvesTruz.class);
    public AvesTruz() {
        logger.debug("Creando avestruz");
        this.setTipoSonido( new SinCanto());
        this.setTipoVuelo(new SinVuelo());
    }
}

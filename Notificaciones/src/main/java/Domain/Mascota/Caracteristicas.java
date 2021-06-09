package Domain.Mascota;

import java.util.List;

public class Caracteristicas {

    public Caracteristicas(List<Caracteristica> caracteristicasObligatorias) {
        this.caracteristicasObligatorias = caracteristicasObligatorias;
    }

    List<Caracteristica> caracteristicasObligatorias;

    public List<Caracteristica> getCaracteristicasObligatorias() {
        return caracteristicasObligatorias;
    }

    public void setCaracteristicasObligatorias(List<Caracteristica> caracteristicasObligatorias) {
        this.caracteristicasObligatorias = caracteristicasObligatorias;
    }

}

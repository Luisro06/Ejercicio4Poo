import java.util.*;

abstract class Especimen {
    String descubridor;
    Date fechaDescubrimiento;
    String eraGeologica;
    String ubicacionHallazgo;

    // Getters
    public String getDescubridor() {
        return descubridor;
    }

    public Date getFechaDescubrimiento() {
        return fechaDescubrimiento;
    }

    public String getEraGeologica() {
        return eraGeologica;
    }

    public String getUbicacionHallazgo() {
        return ubicacionHallazgo;
    }

    // Setters
    public void setDescubridor(String descubridor) {
        this.descubridor = descubridor;
    }

    public void setFechaDescubrimiento(Date fechaDescubrimiento) {
        this.fechaDescubrimiento = fechaDescubrimiento;
    }

    public void setEraGeologica(String eraGeologica) {
        this.eraGeologica = eraGeologica;
    }

    public void setUbicacionHallazgo(String ubicacionHallazgo) {
        this.ubicacionHallazgo = ubicacionHallazgo;
    }
}


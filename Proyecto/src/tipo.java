public class tipo 
{
    public Boolean perro;
    public Boolean gato;

    public tipo() {
    }

    public tipo(Boolean perro, Boolean gato) {
        this.perro = perro;
        this.gato = gato;
    }

    public Boolean getPerro() {
        return perro;
    }

    public void setPerro(Boolean perro) {
        this.perro = perro;
    }

    public Boolean getGato() {
        return gato;
    }

    public void setGato(Boolean gato) {
        this.gato = gato;
    }

    @Override
    public String toString() {
        return "tipo{" + "perro=" + perro + ", gato=" + gato + '}';
    }
    
    
}

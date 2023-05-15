
public class mascota extends tipo
{
    public String nombre;
    public int edad;
    public String raza;

    public mascota() {
    }


    public mascota(String nombre, int edad, String raza, Boolean perro, Boolean gato) {
        super(perro, gato);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
        return super.toString()+"mascota{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
    
    
    
}

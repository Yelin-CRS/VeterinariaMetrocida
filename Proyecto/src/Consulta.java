public class Consulta {
    private String vacuna;
    private String desparacitar;
    private String nombre;
    private String direccion;
    private String raza;
    private int edad;
    private int peso;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public Consulta() {
    }

    
    public String getVacuna() {
        return vacuna;
    }

    public String getDesparacitar() {
        return desparacitar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRaza() {
        return raza;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public void setDesparacitar(String desparacitar) {
        this.desparacitar = desparacitar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Consulta{" + "vacuna=" + vacuna + ", desparacitar=" + desparacitar + ", nombre=" + nombre + ", direccion=" + direccion + ", raza=" + raza + '}';
    }
    
}

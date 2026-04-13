public abstract class Mamifero {
    private String nombre;

    public Mamifero (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void movimiento();
}

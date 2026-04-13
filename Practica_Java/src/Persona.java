public class Persona extends Mamifero{
    private Boolean sexo;
    
    public Persona (Boolean sexo, String nombre) {
        super(nombre);
        this.sexo = sexo;
    }

    public Boolean getSexo() {
        return this.sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public void movimiento() {
        System.out.println("En dos patas");
    }
}

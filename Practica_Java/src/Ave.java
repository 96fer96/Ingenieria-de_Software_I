public class Ave extends Mamifero implements Volador {
    private String especie;
    
    public Ave (String especie, String nombre) {
        super(nombre);
        this.especie = especie;
    }
    
    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void movimiento() {
        System.out.println("Vuela vuelaaa\\n");
    }

    public void volar() {
        System.out.println("brrr");
    }
}

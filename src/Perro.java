
public class Perro extends Animal implements Pet {

    private int edad;
    private String nombrePerro;
    private String raza;

    public Perro(String tipo, String nombre, int edad, String nombrePerro, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
    }

    @Override
    public void bañar() {
        System.out.println("Bañando a : "+this.nombrePerro);

    }

    @Override
    public void vacuna() {
        System.out.println("Vacunando a : "+this.nombrePerro);
    }

    @Override
    public void comer() {
        System.out.println("El perro come purina  ");
    }

    @Override
    public void respirar() {
        System.out.println("El perro respira solo ");
    }
}

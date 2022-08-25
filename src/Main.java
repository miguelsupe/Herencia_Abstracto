public class Main {
    public static void main(String[] args) {
        Perro   p = new Perro("mamifero","perro",3,"Berlin","samoyedo");
        System.out.println("metodos del padre");
        p.respirar();
        p.comer();
        System.out.println("metodos interface");
        p.bañar();
        p.vacuna();
        p.nacer();  }
}

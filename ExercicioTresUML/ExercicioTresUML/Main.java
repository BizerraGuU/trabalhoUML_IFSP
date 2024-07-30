package ExercicioTresUML;


public class Main {
    
    public static void main(String[] args) {
        Triangulo trianguloUm = new Triangulo(0.0, 0.0, 0.0, "");

        trianguloUm.setLadoUm(5);
        trianguloUm.setLadoDois(5);
        trianguloUm.setLadoTres(5);

        trianguloUm.encontraTipoTriangulo();
        
        System.out.println(trianguloUm.getTipoTriangulo());

        trianguloUm.calculaAreaTriangulo();

    }
}

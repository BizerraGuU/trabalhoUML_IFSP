package ExercicioTresUML;

public class Main {
    
    public static void main(String[] args) {
        Triangulo trianguloUm = new Triangulo();

        trianguloUm.setLadoUm(2);
        trianguloUm.setLadoDois(2);
        trianguloUm.setLadoTres(2);

        trianguloUm.encontraTipoTriangulo();
        
        System.out.println(trianguloUm.getTipoTriangulo());

        trianguloUm.calculaAreaTriangulo();

    }
}

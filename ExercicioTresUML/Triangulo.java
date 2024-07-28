package ExercicioTresUML;


public class Triangulo {
    
    private double ladoUm;
    private double ladoDois;
    private double ladoTres;
    private String tipoTriangulo;

    public Triangulo(){}

    public double getLadoUm() {
        return ladoUm;
    }

    public void setLadoUm(double ladoUm) {
        this.ladoUm = ladoUm;
    }

    public double getLadoDois() {
        return ladoDois;
    }

    public void setLadoDois(double ladoDois) {
        this.ladoDois = ladoDois;
    }

    public double getLadoTres() {
        return ladoTres;
    }

    public void setLadoTres(double ladoTres) {
        this.ladoTres = ladoTres;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }

    public void encontraTipoTriangulo() {
        if (ladoUm <= 0 || ladoDois <= 0 || ladoTres <= 0) {
            // verifica se alguns dos lados é menor que zero e dispara o erro
            throw new IllegalArgumentException("Os lados não podem ser negativos ou zero.");
        }

        if (ladoUm + ladoDois <= ladoTres || ladoUm + ladoTres <= ladoDois || ladoDois + ladoTres <= ladoUm) {
            // verifica se o tamanho dos lados gera um triangulo
            throw new IllegalArgumentException("Os lados não formam um triângulo.");
        }

        // essas concidiconais verificam o tipo do triangulo
        // a partir dos criteiros:
        // se dois lados são iguais == isoceles
        // se todos são iguais == equilatero
        // todos diferentes == escaleno

        if (ladoUm == ladoDois && ladoDois == ladoTres) {
            setTipoTriangulo("equilatero");
        } else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
            setTipoTriangulo("isoceles");
        } else {
            setTipoTriangulo("escaleno");
        }
    }
    public void calculaAreaTriangulo(){

        if (tipoTriangulo.equals("escaleno")){
            double p = (ladoUm + ladoDois + ladoTres)/2;

            // p = semiperimetro do triangulo
            // calcula a raiz com o metodo sqrt da classe Math
            double area = Math.sqrt((p*(p-ladoUm)*(p-ladoDois)*(p-ladoTres)));

            //formula de heron A=√(p(p−a)(p−b)(p−c))

            System.out.println("A área do triagulo é de: " + area);
            
            // verifica os angulos dos triangulos a partir das condicionais:
            // se A² < B² + C² == acutangulo
            // se A² > B² + C² == obtusangulo
            // se A² = B² + C² == retangulo
            // utilizando o metodo pow, da classe Math para elevar a dois

            if ((Math.pow(ladoUm, 2)) < (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
            System.out.println("O angulo é acutangulo");
            } 
        
            if ((Math.pow(ladoUm, 2)) > (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é obtusangulo");
            }
            
            if ((Math.pow(ladoUm, 2)) == (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é retangulo");
            }
        }

        if (tipoTriangulo.equals("isoceles")){
            
            if (ladoUm == ladoDois && ladoUm != ladoTres && ladoTres != ladoDois){
               double pitagoras = (Math.pow(ladoUm, 2)) - Math.pow(ladoDois, 2);
               double altura = Math.sqrt(pitagoras);

               double area = (ladoTres*altura)/2; 

               System.out.println("A área do triagulo é de: " + area);
               
               if ((Math.pow(ladoUm, 2)) < (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é acutangulo");
                } 
            
            if ((Math.pow(ladoUm, 2)) > (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é obtusangulo");
                }
            
            if ((Math.pow(ladoUm, 2)) == (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é retangulo");
                }
            }
    
            if (ladoUm == ladoTres && ladoUm != ladoDois && ladoDois != ladoTres){
                double pitagoras = (Math.pow(ladoUm, 2)) - Math.pow(ladoTres, 2);
                double altura = Math.sqrt(pitagoras);

                double area = (ladoDois*altura)/2;

                System.out.println("A área do triagulo é de: " + area);
                
                if ((Math.pow(ladoUm, 2)) < (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é acutangulo");
                } 
                
                if ((Math.pow(ladoUm, 2)) > (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é obtusangulo");
                }
                
                if ((Math.pow(ladoUm, 2)) == (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é retangulo");
                }
            }
    
            if (ladoDois == ladoTres && ladoUm != ladoDois && ladoUm != ladoTres){
                double pitagoras = (Math.pow(ladoDois, 2)) - Math.pow(ladoTres, 2);
                double altura = Math.sqrt(pitagoras);

                double area = (ladoUm*altura)/2;

                System.out.println("A área do triagulo é de: " + area);
                
                if ((Math.pow(ladoUm, 2)) < (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é acutangulo");
                } 
                
                if ((Math.pow(ladoUm, 2)) > (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é obtusangulo");
                }
                
                if ((Math.pow(ladoUm, 2)) == (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                    System.out.println("O angulo é retangulo");
                }
            }
        }

        // nas condicionais, ele verifica o tipo do triangulo com o metodo equals
        // mas poderia ser o equalsIgonoreCase 

        if (tipoTriangulo.equals("equilatero")){
            double raizDeTres = Math.sqrt(3);
            double area = (Math.pow(ladoUm, 2)*raizDeTres)/4;


            System.out.println("A área do triagulo é de: " + area);
            
            if ((Math.pow(ladoUm, 2)) < (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é acutangulo");
            } 
            
            if ((Math.pow(ladoUm, 2)) > (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é obtusangulo");
            }
            
            if ((Math.pow(ladoUm, 2)) == (Math.pow(ladoDois, 2) + Math.pow(ladoTres, 2))){
                System.out.println("O angulo é retangulo");
            }
        }
    }
}

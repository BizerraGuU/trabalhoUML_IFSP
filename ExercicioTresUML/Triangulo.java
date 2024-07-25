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
            throw new IllegalArgumentException("Os lados não podem ser negativos ou zero.");
        }

        if (ladoUm + ladoDois <= ladoTres || ladoUm + ladoTres <= ladoDois || ladoDois + ladoTres <= ladoUm) {
            throw new IllegalArgumentException("Os lados não formam um triângulo.");
        }

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

            double area = Math.sqrt((p*(p-ladoUm)*(p-ladoDois)*(p-ladoTres)));

            //formula de heron A=√(p(p−a)(p−b)(p−c))

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

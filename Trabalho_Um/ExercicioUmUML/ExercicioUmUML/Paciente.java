package ExercicioUmUML;

public class Paciente {
    
    private String nomePaciente;
    private double pesoPaciente;
    private double alturaPaciente;
    private double imcPaciente;

    // construtor
    public Paciente(String nomePaciente, double pesoPaciente, double alturaPaciente, double imcPaciente){
        this.nomePaciente = nomePaciente;
        this.pesoPaciente = pesoPaciente;
        this.alturaPaciente = alturaPaciente;
        this.imcPaciente = imcPaciente;
    } 

    public String getNomePaciente() {
        return nomePaciente;
    }
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    public double getPesoPaciente() {
        return pesoPaciente;
    }
    public void setPesoPaciente(double pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }
    public double getAlturaPaciente() {
        return alturaPaciente;
    }
    public void setAlturaPaciente(double alturaPaciente) {
        this.alturaPaciente = alturaPaciente;
    }
   
    public double getImcPaciente() {
        return imcPaciente;
    }

    public void setImcPaciente(double imcPaciente) {
        this.imcPaciente = imcPaciente;
    }

    public void calculaIMC(){

        /* calcula, e "seta" o Imc do paciente a partir da conta
         peso do paciente dividio pela altura ao quadrado
         para calcular o quadrado, utilizei a class Math e o método pow
         sendo que funciona da seguinte maneira:
         Math.pow(valorQueSeraElevado, valorDaElevacao)
         aqui, no caso, é a altura do paciente elevado a 2 */

        setImcPaciente((pesoPaciente)/(Math.pow(alturaPaciente, 2)));

        System.out.println("o imc do paciente é: " + imcPaciente);;
    }

    public void calculaFaixaDePeso(){

        /* Aqui, a partir do metodo getImcPaciente, verfica se 
         * o valor ali presente corresponde à alguma das condições 
         * para avaliar a partir das condicionais de if
         */

        if (getImcPaciente() >= (18.50) &&  getImcPaciente() <= (24.99)){
            System.out.println("Peso Normal");
        }

        if (getImcPaciente() >= (25.00) &&  getImcPaciente() <= (29.99)){
            System.out.println("Pre-Obsidade");
        }

        if (getImcPaciente() >= (30.00) &&  getImcPaciente() <= (34.99)){
            System.out.println("Obesidade Grau I");
        }

        if (getImcPaciente() >= (35.00) &&  getImcPaciente() <= (39.99)){
            System.out.println("Obesidade Grau II");
        }

        if (getImcPaciente() >= (40.00)){
            System.out.println("Obesidade Grau III");
        }
    }
}

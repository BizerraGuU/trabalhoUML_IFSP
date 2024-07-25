package ExercicioUmUML;

public class Paciente {
    
    private String nomePaciente;
    private double pesoPaciente;
    private double alturaPaciente;
    private double imcPaciente;

    public Paciente(){}

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

        setImcPaciente((pesoPaciente)/(Math.pow(alturaPaciente, 2)));

        System.out.println("o imc do paciente é: " + imcPaciente);;
    }

    public void calculaFaixaDePeso(){
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

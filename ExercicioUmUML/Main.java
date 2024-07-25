package ExercicioUmUML;

public class Main {
    public static void main(String[] args) {
        Paciente pacienteUm = new Paciente();

        pacienteUm.setAlturaPaciente(1.76);
        pacienteUm.setNomePaciente("Gustavo");
        pacienteUm.setPesoPaciente(71.8);

        pacienteUm.calculaIMC();
        pacienteUm.calculaFaixaDePeso();

    }   
}


import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Eleitor eleitorUm = new Eleitor("", Calendar.getInstance(), 0);

    Calendar calendario = Calendar.getInstance();
    
    calendario.set(2003, Calendar.SEPTEMBER, 10); // passar a data de nascimento do eleitor

    eleitorUm.setDataNascimento(calendario); // faz o set da data digitada para realizar verificação

    eleitorUm.verificaIdadeEleitor();
    eleitorUm.verificaTipoEleitor();

    System.out.println(eleitorUm.getIdadeEleitor());
  }
}

package ExercicioDoisUML;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* Essas bibliotecas foram utilizadas a fim de receber 
 * uma data e calcular a quantidade de tempo rapidamente
 * sem a necessidade de várias condicionais
 * não entendi como funcionava o Date, 
 * por isso fui para o Calendar
 */

public class Eleitor{

    private String nomeEleitor;
    private Calendar dataNascimento; // atributo do tipo Calendar
    private int idadeEleitor;

    public Eleitor(){} // construtor
 
    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdadeEleitor() {
        return idadeEleitor;
    }

    public void setIdadeEleitor(int idadeEleitor) {
        this.idadeEleitor = idadeEleitor;
    }

    public void verificaTipoEleitor(){

        // aqui, ele apenas verifica a idade do eleitor
        // e retorna alguma das condicionais.

        if (idadeEleitor < 16){
            System.out.println("Não Eleitor");
        }

        if (idadeEleitor <= 16 && idadeEleitor < 18 && idadeEleitor > 65){
            System.out.println("Eleitor Facultativo");
        }

        if (idadeEleitor >= 18 && idadeEleitor <= 65){
            System.out.println("Eleitor Obrigatorio");
        }
    }

    public int verificaIdadeEleitor(){

        Calendar diaDeHoje = Calendar.getInstance(); 
        // instanciando um objeto do tipo Calendar
        // getInstance() instancia o metodo get do objeto.
        
       
        int idade = diaDeHoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        setIdadeEleitor(idade);

        /* aqui, ele diz que a idade recebe o valor correspondente à subtração
         * dos metodos get(Calendar.YEAR) do ano atual e do ano dito pelo eleitor
         * e então "seta" a idade
         */

        if (diaDeHoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH) ||
            (diaDeHoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && 
            diaDeHoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;

            /* nessa condiconal, ele verifica se o mês e o dia correspondem à data digitada 
             * pelo usuário, caso não corresponda, no caso, ela seja menor. ex:
             * hoje é dia 28/07/2024 e eu nasci em 10/09/2003
             * então ele verifica se o dia é menos e se o mês é menor a fim de saber com exatidao
             * a idade do usuario (em anos)
             * então ele subitrai com o idade--
             */
        }

        return idade; // retorna a idade
    }


    @Override
    public String toString() {
        // toString para mostrar ao usuário um texto legível
        // o simpledateformat é para mostrar a data em um formato de dia/mes/ano
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dataFormat.format(dataNascimento.getTime());
        // aqui, salva dentro da variavel dataFormatada
        return "Eleitor [nomeEleitor=" + nomeEleitor + ", dataNascimento=" + dataFormatada + ", toString()=" + super.toString() + "]";
    }
}
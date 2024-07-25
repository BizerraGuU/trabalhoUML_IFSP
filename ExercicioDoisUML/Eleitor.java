package ExercicioDoisUML;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Eleitor{

    private String nomeEleitor;
    private Calendar dataNascimento;
    private int idadeEleitor;

    public Eleitor(){}
 
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

    public void verificaTipoEleitor(){

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

       
        int idade = diaDeHoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        setIdadeEleitor(idade);

        if (diaDeHoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH) ||
            (diaDeHoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && 
            diaDeHoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        return idade;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(dataNascimento.getTime());
        return "Eleitor [nomeEleitor=" + nomeEleitor + ", dataNascimento=" + formattedDate + ", toString()=" + super.toString() + "]";
    }



    public int getIdadeEleitor() {
        return idadeEleitor;
    }



    public void setIdadeEleitor(int idadeEleitor) {
        this.idadeEleitor = idadeEleitor;
    }

    
}
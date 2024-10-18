//Autocarro da FrotaAzul

public class Autocarro
{
    String matricula;
    int kms;
    
    public Autocarro(String m){
        this.matricula = m;
        kms = 0;
    }
        
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String novaMatricula){
        this.matricula = novaMatricula;
    }
    
    public int getKms(){
        return this.kms;
    }
    
    public void setKms(int nKms){
        this.kms = this.kms + nKms;
    }
    
    public String toString(){
        String resultado = "Matrícula:" + this.matricula + "Kms:" + this.kms;
        return resultado;
    }
}

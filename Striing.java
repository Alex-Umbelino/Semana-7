public class Striing
{//Atributo
  private String nomeDaNota;
  private String nota;
  
  //metodo construtor
  public Striing(String nomeDaNota,String aNota)
  { this.nomeDaNota=nomeDaNota;
   nota=aNota;
  
  }
  //metodo modificador
  public void setNota(String aNota)
  {
   this.nota=aNota;
  }
  public void setNomeDaNota(String nomeDaNota)
  {
   this.nomeDaNota=nomeDaNota;
  }
  //metodo de acesso
  public String getNota()
  {
   return nota;
  }
  public String getNomeDaNota()
  {
   return nomeDaNota;
  }
  
   public String getDados()
   {
    return "Nome da nota: "+nomeDaNota+"\nNota:\n"+nota;
   }

}
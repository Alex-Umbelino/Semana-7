public class Caixa
{  //Atributos
  private String corretor;
  private int posicao;
  private double peso;
  private String dono;
  // dono é o nome do dono da caixa
  
  //Metodo construtor
  public Caixa(String co,int po,double pe,String dono)
  {
   corretor=co;
   posicao=po;
   peso=pe;
   this.dono=dono;
  }
  //metodos modificadores
  public void setCorretor(String co)
  {
   corretor=co;
  }
  public void setPosicao(int po)
  {
   posicao=po;
  }
  public void setPeso(double pe)
  {
   peso=pe;
  }
  public void setDono(String dono)
  {
   this.dono=dono;
  }
  
 //Metodos de acesso
 
 public String getCorretor()
 {
   return corretor;
 }
 public int getPosicao()
 {
   return posicao;
 }
 public double getPeso()
 {
   return peso;
 }
 public String getDono()
 {
   return dono;
 }
  
 public String getDados()
 {
   return "Corretor: "+corretor+"\nNa posição: "+posicao+"\nPeso: "+peso+"\nDono: "+dono;
 } 
 
}
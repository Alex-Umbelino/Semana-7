 import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Deposito
{//Atributo
   private ArrayList<Caixa> caixas;
   //metodo construtor padr�o
   public Deposito()
   {  //Instanciando
      caixas=new ArrayList<Caixa>();
   }
   //Metodo para Inserir/adicionar
   public void addCaixa(Caixa caixa)
   {
     caixas.add(caixa);
   }
   //O m�todo que realmente adiciona
   public void addCaixa(String corretor,int posicao,double peso,String dono)
   {
    //Criando novo objeto
    Caixa caixa=new Caixa(corretor,posicao,peso,dono);
    
    caixa.setCorretor(corretor);
    caixa.setPosicao(posicao);
    caixa.setPeso(peso);
    caixa.setDono(dono);
    //Adicionando o objeto caixa para uma posi��o no Array caixas
    caixas.add(caixa);
   }
   //Metodo para remover
    public void remover(String dono)
    { 
      int posicao = buscarCaixa(dono);
     
     if(posicao >= 0)
     {
       caixas.remove(posicao);
     }
    }
    
    //Metodo de busca
    public int buscarCaixa(String dono)
    {
      for(int i=0;i<caixas.size();i=i+1)
      { //Percorre o Array e guarda o indice no objeto caixa
        Caixa caixa=caixas.get(i);
        //guar
        String nomeDoDonoDaCaixa=caixa.getDono();
        
        if(dono.equalsIgnoreCase(nomeDoDonoDaCaixa))
        {
         return i;
        }
        
      }
      return -1; //n�o achou
    }
    
    //Metodo para listar as caixas
    public void listarCaixas()
    {
       for(int i = 0; i <caixas.size(); i++)
       {  
          Caixa caixa = caixas.get(i); 
          if(caixa.getPeso()>10.0)
          {
            JOptionPane.showMessageDialog(null,caixa.getDados());
          } 
            
       }
    }
    
    
    //Altera a posi��o das caixas
    public void alterar(String dono, int novaPosicao)
    {
        //Aqui eu encontro o indice onde est� o que estou procurando   
        int posicao=buscarCaixa(dono);
      //Aqui eu pego o objeto no ArrayList na posi��o posicao e coloco em um objeto caixa
      Caixa caixa=caixas.get(posicao);
     //Aqui eu atribuo o objeto na nova posi��o
      caixas.add(novaPosicao,caixa);
        
  
    }
}
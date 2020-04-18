import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BlocoDeNotas
{
   private ArrayList<Striing> notas;
   
   //metodo construtor padrão
   public BlocoDeNotas()
   {
     notas=new ArrayList<Striing>();
   }
   //Add nota
   public void inserirNota(String nomeDaNota,String nota)
   {
   
    Striing striing=new Striing(nomeDaNota,nota);
    
    striing.setNota(nota);
    striing.setNomeDaNota(nomeDaNota);
   
    
    
    notas.add(striing);
   }
   //apaga nota
   public void remover(String nomeDaNota)
   { 
     int posicao = buscarNota(nomeDaNota);
     
     if(posicao >= 0)
     {
       notas.remove(posicao);
     }

      
   }
   
   //Altera nota
   public void alterar(String nomeDaNota)
   {
     
    
    
         int indice=buscarNota(nomeDaNota);
        
             Striing striing=notas.get(indice);
        
        String notaProcurada=striing.getNota();
   
     
           String novaNota=JOptionPane.showInputDialog(null,"Substituindo a nota:"+notaProcurada+ "\n\nDigite a nova nota para "+nomeDaNota);
          notas.get(indice).setNota(novaNota); 
          //striing.setNota(novaNota);
         

 
   
   }
   
    
   
   //Buscar Nota
   
   public int buscarNota(String nota)
   {
      for(int i=0;i<notas.size();i=i+1)
      { 
        Striing striing=notas.get(i);
        
        String nomeDaNotaProcurada=striing.getNomeDaNota();
        
         
        if(nota.equalsIgnoreCase(nomeDaNotaProcurada))
        {
         return i;
        }
                
      }
      return -1; //Não achou
   }
   
   
   //Listar notas
   public void listarNotas()
   {
     for(int i=0;i<notas.size();i=i+1)
     {
      Striing striing=notas.get(i);
      JOptionPane.showMessageDialog(null,striing.getDados());
     } 
   }
   
   
}   
import javax.swing.JOptionPane;
public class Teste
{
  public static void main(String[] args)
  { 
    Deposito deposito= new Deposito();
     
     int menu=0;
      String corretor=null;
      String dono=null;
      
     do
     {
      menu=Integer.parseInt(JOptionPane.showInputDialog("1-Adicionar caixa:\n 2-Remover caixa:\n3-Busca caixa:\n4-Mudar caixa:\n5-Listar mais pesadas que 10:\n6-Sair."));
      
      switch (menu)
      {
       case 1:
       {  
         corretor=JOptionPane.showInputDialog("Digite o nome do corretor:");
         int posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da caixa:"));
         double peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa:"));
         dono=JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
         //Caso eu quisesse ,poderia istanciar e então usar a variavel pra passar
         //Caixa caixa=new Caixa(corretor,posicao,peso,dono);
         //deposito.addCaixa(caixa);
        deposito.addCaixa(corretor,posicao,peso,dono);
        break;
       }
       case 2:
       {
        dono=JOptionPane.showInputDialog("Qual o nome do dono,cuja caixa deseja remover do estoque?");
         deposito.remover(dono);
         
        break;
       }
       case 3:
       {  
          dono=JOptionPane.showInputDialog("Digite o nome do dono,cuja caixa deseja encontrar:");
          int indice=deposito.buscarCaixa(dono);
          
          if(indice>=0)
          {
            JOptionPane.showMessageDialog(null,"A caixa esta no indice: "+indice,"Indice encontrado:",JOptionPane.PLAIN_MESSAGE);
          }
          else
          {
            JOptionPane.showMessageDialog(null,"Esta caixa não está aqui.");

          }
          
          
          
          break;
       }
       case 4:
       { dono=JOptionPane.showInputDialog("Qualo nome do dono, cuja caixa deseja mover?");
         int novaPosicao=Integer.parseInt(JOptionPane.showInputDialog("Qual a nova posição?"));
        
        deposito.alterar(dono,novaPosicao);
        
         corretor=JOptionPane.showInputDialog("Digite o nome do corretor:");
         int posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da caixa:"));
         double peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da caixa:"));
         dono=JOptionPane.showInputDialog("Digite o nome do dono da caixa:");
        
        deposito.addCaixa(corretor,posicao,peso,dono);
       
        break;
       }
       case 5:
       {
         deposito.listarCaixas();
         break;
       }
       case 6:
       {
        JOptionPane.showMessageDialog(null,"tchau!");
        break;
       }
      }
     
     }
     while(menu!=6);

  
  
 
  }

}
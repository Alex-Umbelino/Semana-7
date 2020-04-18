import javax.swing.JOptionPane;
public class AppBloco
{
   public static void main(String[] args)
   { int menu=0;
     String nomeDaNota="";
     String nota="";
   
     BlocoDeNotas blocoDeNotas=new BlocoDeNotas();
     do
     { 
       menu=Integer.parseInt(JOptionPane.showInputDialog("1-Insira uma nota:\n2-Remova uma nota:\n3-Altere uma nota:\n4-Listar todas as notas:\n5-Saia do sistema."));
       
       switch(menu)
       { 
         case 1:
         {
          
           nomeDaNota=JOptionPane.showInputDialog("Digite o nome da nota:");
           nota=JOptionPane.showInputDialog("Digite a nota:");
        
           blocoDeNotas.inserirNota(nomeDaNota,nota);
          break;
         }
         case 2:
         {
           nomeDaNota=JOptionPane.showInputDialog("Digite nome da nota que deseja excluir:");
           
           blocoDeNotas.remover(nomeDaNota);
           break;
         }
         case 3:
         { 
          nomeDaNota=JOptionPane.showInputDialog("Digite o nome da nota que deseja alterar:"); 
          blocoDeNotas.alterar(nomeDaNota);
          break;
         }
         case 4:
         {
          blocoDeNotas.listarNotas();

          break;
         }
       
       
             
       }
     
     }
     while(menu!=5); 
   }
}
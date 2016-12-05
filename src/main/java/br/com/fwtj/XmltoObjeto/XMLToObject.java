package br.com.fwtj.XmltoObjeto;  

 import java.io.File; 
 import java.util.List; 
 import com.thoughtworks.xstream.XStream; 
 import com.thoughtworks.xstream.converters.basic.DateConverter; 

 public class XMLToObject { 

      public static void main(String[] args) { 
           new XMLToObject().transformXMLToObject(); 
      } 

      private void transformXMLToObject(){ 
           File nossoArquivoXML = new File("funcionario.xml"); 
           XStream xStream = new XStream(); 

           /*configuracao*/ 
           xStream.alias("funcionario", Funcionario.class); 
           xStream.registerConverter(new DateConverter("dd/MM/yyyy", null)); 
           xStream.alias("telefones", List.class); 
           xStream.alias("telefone", Long.class); 
           Funcionario funcionario = (Funcionario) xStream.fromXML(nossoArquivoXML); 
           this.printReport(funcionario); 
      } 

      private void printReport(Funcionario funcionario){ 
           System.out.println("--- Relatório do funcionário ---"); 
           System.out.println("Nome: " + funcionario.getNome()); 
           System.out.println("Email: " + funcionario.getEmail()); 
           System.out.println("Data de nascimento: " + funcionario.getDtNascimento()); 
           System.out.println("Cargo: " + funcionario.getCargo()); 
           System.out.println("Matrícula: " + funcionario.getMatricula()); 
           if(!funcionario.getTelefones().isEmpty()){ 
                System.out.println("Telefones: "); 
                for (Long phone : funcionario.getTelefones()) { 
                     System.out.println("\t" + phone); 
                }           
           } 
      } 
 } 
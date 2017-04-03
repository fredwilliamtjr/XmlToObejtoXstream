package br.com.fwtj.XmltoObjeto;

import java.io.File;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;

public class XMLToObject {

    public static void main(String[] args) {
        //new XMLToObject().transformXMLToFuncionario(); 
        transformXMLToProduto();
    }

    private void transformXMLToFuncionario() {
        File nossoArquivoXML = new File("funcionario.xml");
        XStream xStream = new XStream();

        /*configuracao*/
        xStream.alias("funcionario", Funcionario.class);
        xStream.registerConverter(new DateConverter("dd/MM/yyyy", null));
        xStream.alias("telefones", List.class);
        xStream.alias("telefone", Long.class);
        Funcionario funcionario = (Funcionario) xStream.fromXML(nossoArquivoXML);
        this.printReportFuncionario(funcionario);
    }

    private void printReportFuncionario(Funcionario funcionario) {
        System.out.println("--- Relatório do funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Data de nascimento: " + funcionario.getDtNascimento());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        if (!funcionario.getTelefones().isEmpty()) {
            System.out.println("Telefones: ");
            for (Long phone : funcionario.getTelefones()) {
                System.out.println(phone);
            }
        }
    }

    public static void transformXMLToProduto() {
        File nossoArquivoXML = new File("produto.xml");
        XStream xStream = new XStream();
        xStream.ignoreUnknownElements();

        /*configuracao*/
        xStream.alias("sistema", Produto.class);
        xStream.alias("det", List.class);
        xStream.alias("prod", Prod.class);
        xStream.alias("imposto", List.class);
        xStream.alias("ICMS", Icms.class);
       
        
        

        Produto poduto = (Produto) xStream.fromXML(nossoArquivoXML);
        printReportProduto(poduto);
    }

    private static void printReportProduto(Produto produto) {
        //System.out.println("Produto: " + produto);
        List<Object> det = produto.getDet();
        
        
        
        Prod prod = (Prod) det.get(0);
        
        List<Object> listaObjetoIcms = (List<Object>) det.get(1);
        Icms icms = (Icms) listaObjetoIcms.get(0);
        
        System.out.println(prod);
        System.out.println(listaObjetoIcms);
        
        

    }
}

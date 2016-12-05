package br.com.fwtj.XmltoObjeto;  

 import java.util.Date; 
 import java.util.List; 

 public class Funcionario { 
      private String nome; 
      private String email; 
      private Date dtNascimento; 
      private String cargo; 
      private String matricula; 
      private List<Long> telefones; 

      public String getNome() { 
           return nome; 
      } 

      public void setNome(String nome) { 
           this.nome = nome; 
      } 

      public String getEmail() { 
           return email; 
      } 

      public void setEmail(String email) { 
           this.email = email; 
      } 

      public Date getDtNascimento() { 
           return dtNascimento; 
      } 

      public void setDtNascimento(Date dtNascimento) { 
           this.dtNascimento = dtNascimento; 
      } 

      public String getCargo() { 
           return cargo; 
      } 

      public void setCargo(String cargo) { 
           this.cargo = cargo; 
      } 

      public String getMatricula() { 
           return matricula; 
      } 

      public void setMatricula(String matricula) { 
           this.matricula = matricula; 
      } 

      public List<Long> getTelefones() { 
           return telefones; 
      } 

      public void setTelefones(List<Long> telefones) { 
           this.telefones = telefones; 
      } 
 } 
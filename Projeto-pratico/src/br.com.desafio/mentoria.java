import java.time.LocalDate;

 public class Br.com.dio.desafio.mentoria {
    
    public class mentoria extends Conteudo {}

    private   String titulo; 
    private  String descrição;
    private  LocalDate data ;


    public Mentoria ()

    public String getTitulo() {
        return titulo;
    }
    public String getDescrição() {
        return descrição;
    }
    public LocalDate getData() {
        return data;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public void setData(LocalDate data) {
        this.data = data;

    }

  Override 
  puplic double calcularXp() {

      return 0; 


  }




}

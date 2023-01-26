public  abstract class Br.com.dio.conteudo {
    
Protected static final XP_PADRAO = 10d;

    private String titulo;
    private String descricao; 

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descriçao=" + getDescricao() + ", data =" + data + "]";
    }


}
    


    }




}

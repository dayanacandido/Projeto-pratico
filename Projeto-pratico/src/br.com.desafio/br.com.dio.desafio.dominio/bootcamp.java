import java.time.LocalDate;
import java.util.HashSet;
import java.util.linkedHashSet;
import java.util.Set;



public class bootcamp {
    
private String nome;

private String descricao;

private final LocalDate dataInicial = lacalDate.now();

private final localDate dataFinal= dataInicial.plusDays(45);
 
private set<Dev> devsincritos = new HashSet<>();

private Set<Conteudo> conteudos = new LinkedHashset<>();

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public LocalDate getDataInicial() {
    return dataInicial;
}

public localDate getDataFinal() {
    return dataFinal;
}

public set<Dev> getDevsincritos() {
    return devsincritos;
}

public void setDevsincritos(set<Dev> devsincritos) {
    this.devsincritos = devsincritos;
}

public Set<Conteudo> getConteudos() {
    return conteudos;
}


}


 
}

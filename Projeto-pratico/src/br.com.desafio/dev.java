import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class dev {  
private String name ;    
private  Set<conteudo> conteudosIncritos = new linkedHashset<>();
private  Set<conteudo> conteudosConcluidos = new linkedHashset<>();

public void inscreverBootcamp(Bootcamp bootcamp){}

this.conteudosIncritos.addall(bootcamp.qetConteudo());
bootcamp.qetDevsInscritos().add(this);

public void progredir() {}

Optional<Conteudo> conteudo =  this.conteudosIncritos.Stream().findFirst();

if (conteudo.isPresent()){
   this.conteudosConcluidos.add(conteudo.qet());
   this.conteudosInscritos.remove(conteudo.qet());
    
     }else{
        System.err.println ( "Voce não está matriculado em nenhum conteudo");

    }

       
public double calcularTotalXp () {}

    return this.conteudosConcluidos 
    .stream();
    .mapToDouble(Conteudo:calcularXp);

    .sum ();




public String getName() {
    return name;
}

public Set<conteudo> getConteudosIncritos() {
    return conteudosIncritos;
}

public Set<conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
}

public void setName(String name) {
    this.name = name;
}

public void setConteudosIncritos(Set<conteudo> conteudosIncritos) {
    this.conteudosIncritos = conteudosIncritos;
}

public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
    this.conteudosconcluidos = conteudosConcluidos;
}

}

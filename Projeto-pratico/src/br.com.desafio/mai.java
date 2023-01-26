package br.com.desafio;

public class mai {

Curso curso1 = new Curso();
curso1.setTitulo("curso js");
curso1.setDescricao("descricao curso js");
curso1.setCargaHoraria(4)

Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescricao("descricao curso js");
curso2.setCargaHoraria(4)


Mentoria mentoria = new Mentoria();
mentoria.setTitulo("mentoriade java");
mentoria.setDescricao("descricao mentoria java");
mentoria.setData(LocalDate.now());

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp java Developer");
bootcamp.setDescricao("Descricao Bootcamp Java Developer");
bootcamp.qetConteudos().add(curso1);
bootcamp.qetConteudos().add(curso2);
bootcamp.qetConteudos().add(mentoria);

Dev devCarlos = new Dev();
devCarlos.setNome("Camila");
devCarlos.inscreverBootcamp(bootcamp);
System.out.println("Conteudo Inscrito"+ devcarlos.qetConteudoInscritos);


devcarlos.progredir();
System.out.println("-");
System.out.println("Conteudo concluidos" + devcarlos.qetConteudoInscritos);
System.out.println("Conteudo concluidos" + devcarlos.qetConteudoInscritos);
System.out.println ("XP:" + devcarlos.calcularTotalXp());

System.out.println("----------")


Dev devmaria = new Dev();
devMaria.setNome("maria");
devmaria.inscreverBootcamp(bootcamp);
System.out.println("Conteudo Inscrito"+ devMaria.qetConteudoInscritos);

devMaria.progredir();
System.out.println("-");
System.out.println("Conteudo Inscrito"+ devMaria.qetConteudoInscritos);
System.out.println("Conteudo concluidos"+ devMaria.qetConteudoInscritos);
System.out.println ("XP:" + devMaria.calcularTotalXp());












}

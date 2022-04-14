
class Paciente {
  String nome;
  Medico medico;
  int diasInternado=2;

  void exibirRelatorioPac() {
    System.out.print("nome paciente:" + nome);
    System.out.print("medico responsável:" + medico.nome);
    System.out.print("Dias Internado:" + diasInternado);
  }

  int retornarDiasInternado() {
    System.out.print("Dias internado" + diasInternado);
    return diasInternado;
  }
}
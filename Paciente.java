
class Paciente {
  String nome;
  Medico medico;
  int diasInternado;

  Paciente(char nome, int dias) {
    this.nome = nome;
    this.diasInternado = dias;
  }

  void exibirRelatorioPac() {
    System.out.print("nome paciente:" + nome);
    System.out.print("medico responsável:" + medico.nome);
    System.out.print("Dias Internado:" + diasInternado);
  }

  int retornarDiasInternado() {
    return 1;
  }
}
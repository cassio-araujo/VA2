class Main {
  public static void main(String[] args) {
    Ala ala1 = new Ala();
    Ala ala2 = new Ala();

    Quarto quarto1 = new Quarto(2);
    Quarto quarto2 = new Quarto(3);

    Paciente paciente1 = new Paciente();
    Paciente paciente2 = new Paciente();
    Paciente paciente3 = new Paciente();
    Paciente paciente4 = new Paciente();

    quarto1.retornarMaxDiasInter();
    quarto2.retornarMinDiasInter();

   paciente1.exibirRelatorioPac();
   paciente2.exibirRelatorioPac();

   quarto1.verificarQuartoVazio();

    paciente1.retornarDiasInternado();


    ala1.exibirRelatorio();
    ala2.exibirRelatorio();
    

  }

}
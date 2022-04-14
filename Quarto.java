class Quarto {
  int numero;
  Paciente paciente01;
  Paciente paciente02;
  Paciente paciente03;

  Quarto(int num) {
    this.numero = num;
  }

  int retornarMaxDiasInter() {
    if (paciente01.diasInternado > paciente02.diasInternado) {
      if (paciente01.diasInternado > paciente03.diasInternado) {
        return paciente01.diasInternado;
      } else {

        return paciente03.diasInternado;
      }
    } else {
      if (paciente02.diasInternado > paciente03.diasInternado) {

        return paciente02.diasInternado;
      } else {

        return paciente03.diasInternado;
      }
    }
  }

  int retornarMinDiasInter() {
    if (paciente01.diasInternado < paciente02.diasInternado) {
      if (paciente01.diasInternado < paciente03.diasInternado) {

        return paciente01.diasInternado;
      } else {

        return paciente03.diasInternado;
      }
    } else {
      if (paciente02.diasInternado < paciente03.diasInternado) {

        return paciente02.diasInternado;
      } else {

        return paciente03.diasInternado;
      }
    }
  }

  int diasPorPaciente(int nun) {
    return 1;
  }

  void verificarQuartoVazio() {
    if (paciente01 == null) {
  System.out.println("paciente 1 esta vazio");
    }
    if (paciente02 == null) {
  System.out.println("paciente 2 esta vazio");

    }
    if (paciente03 == null) {
  System.out.println("paciente 3 esta vazio");

    }
    else{
  System.out.println("nao ha quartos vazios");
      
    }
    
  }

}

package com.dio.desafio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public Curso() {
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    if (cargaHoraria <= 0) {
      throw new IllegalArgumentException("Carga horária deve ser maior que zero.");
    }
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }
}

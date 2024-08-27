package com.dio.desafio.dominio;

public class Certificado {

    public static String gerarCertificado(Dev dev, Bootcamp bootcamp) {
        if (dev.getConteudosConcluidos().containsAll(bootcamp.getConteudos())) {
            return "Certificado: " + dev.getNome() + " concluiu o bootcamp " + bootcamp.getNome() + " em "
                    + bootcamp.getDataFinal();
        } else {
            return "Dev " + dev.getNome() + " ainda não concluiu todos os conteúdos do bootcamp " + bootcamp.getNome();
        }
    }
}

package iphone;

import sistema.Sistema;

public class Iphone {
    public static void main(String[] args) {
        Sistema sm = new Sistema();

        sm.ligar();
        sm.atender();
        sm.iniciarCorreioVoz();
        sm.tocar();
        sm.pausar();
        sm.selecionarMusica();
        sm.exibirPagina();
        sm.adicionarNovaAba();
        sm.atualizarPagina();
    }
}
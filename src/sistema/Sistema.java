package sistema;

import sistema.funcoes.navegador.NavegadorInternet;
import sistema.funcoes.reprodutor.ReprodutorMusical;
import sistema.funcoes.telefone.AparelhoTelefonico;

public class Sistema implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de Voz");
    }
    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando música atual");
    }

    public void selecionarMusica() {
        System.out.println("Selecionado música");
    }
    public void exibirPagina() {
        validarConectadoInternet();
        System.out.println("Exibindo página da Internet");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

}
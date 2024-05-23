import com.interfaces.AparelhoTelefonico;
import com.interfaces.NavegadorInternet;
import com.interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        System.out.println("\n*** Funções de Telefone ***\n");

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("\n*** Funções de IPod ***\n");

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        System.out.println("\n*** Funções de Navegador WEB ***\n");

        iPhone.exibirPag();
        iPhone.addNovaAba();
        iPhone.atualizarPag();
    }



    @Override
    public void ligar() {
        System.out.println("Ligando com IPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo com IPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz do IPhone");
    }

    @Override
    public void exibirPag() {
        System.out.println("Exibindo páginas da Web com IPhone");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Adicionar nova aba no navegador do IPhone");

    }

    @Override
    public void atualizarPag() {
        System.out.println("Atualizando páginas da Web no IPhone");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzir músicas no IPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música no IPhone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música no IPhone");
    }
}

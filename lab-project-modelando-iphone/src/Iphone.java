public class Iphone implements ReprodutorMusical, AparelhoEletronico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("iPhone tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("iPhone tocando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}

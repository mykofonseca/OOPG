package br.com.waterbottle.model;

public class WaterBottle {
    public String cor;
    public String construcao;
    public double capacidadeML;
    public double volumeAtualML;
    public boolean tampaAberta;

    public WaterBottle(String cor, String construcao, double capacidadeML) {
        this.cor = cor;
        this.construcao = construcao;
        this.capacidadeML = capacidadeML;
        this.volumeAtualML = 0;
        this.tampaAberta = false;
    }

    // Método novo: abre ou fecha a tampa
    public void abrirTampa() {
        this.tampaAberta = !this.tampaAberta;
        System.out.println("Tampa " + (this.tampaAberta ? "aberta" : "fechada") + ".");
    }

    // Método novo: adiciona líquido na garrafa
    public void adicionarLiquido(double volumeML) {
        // Regra de negócio: só pode adicionar líquido com a tampa aberta
        if (!this.tampaAberta) {
            System.out.println("Erro: abra a tampa antes de adicionar líquido.");
            return;
        }
        // Regra de negócio: o volume deve ser maior que zero
        if (volumeML <= 0) {
            System.out.println("Erro: o volume deve ser maior que zero.");
            return;
        }
        this.volumeAtualML += volumeML;
        System.out.println("Líquido adicionado. Volume atual: " + this.volumeAtualML + "ml");
    }

    // Método novo: despeja líquido da garrafa
    public void despejarLiquido(double volumeML) {
        // Regra de negócio: só pode despejar com a tampa aberta
        if (!this.tampaAberta) {
            System.out.println("Erro: abra a tampa antes de despejar líquido.");
            return;
        }
        // Regra de negócio: não pode despejar mais do que existe na garrafa
        if (volumeML > this.volumeAtualML) {
            System.out.println("Erro: não há líquido suficiente na garrafa.");
            return;
        }
        this.volumeAtualML -= volumeML;
        System.out.println("Líquido despejado. Volume atual: " + this.volumeAtualML + "ml");
    }
}

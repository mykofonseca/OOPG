package br.com.waterbottle.main;

import br.com.waterbottle.model.WaterBottle;

public class MainSystem {

    public static void main(String[] args) {
        WaterBottle garrafa1 = new WaterBottle("Preta", "Suporte MagSafe", 500);

        System.out.println("Tentando adicionar líquido com a tampa fechada:");
        garrafa1.adicionarLiquido(300);

        System.out.println("\nAbrindo a tampa:");
        garrafa1.abrirTampa();

        System.out.println("\nAdicionando líquido válido:");
        garrafa1.adicionarLiquido(300);

        System.out.println("\nAdicionando volume inválido (negativo):");
        garrafa1.adicionarLiquido(-50);

        System.out.println("\nDespejando líquido válido:");
        garrafa1.despejarLiquido(100);

        System.out.println("\nDespejando mais do que existe (inválido):");
        garrafa1.despejarLiquido(9999);

        System.out.println("\nEstado final: " + garrafa1.cor + " | Volume: " + garrafa1.volumeAtualML + "ml");
    }
}

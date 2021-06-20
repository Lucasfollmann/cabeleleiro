/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Order {

    int x = 0;
    double valorTotal;

    public void order() {
        SizePizza sizePizza = new SizePizza();
        Flavor flavor = new Flavor();
        EdgeFlavor edgeFlavor = new EdgeFlavor();
        Drink drink = new Drink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tamanho de pizza desejado?");
        System.out.println("[1] - Gigante");
        System.out.println("[2] - Familia ");
        System.out.println("[3] - Media ");
        System.out.println("[4] - Pequena");
        System.out.println("[5] - Broto");
        System.out.println("Digitalize qual o tamanho da pizza desejado: ");
        sizePizza.selectSize(entrada.nextInt());

        while (x < sizePizza.amountofflavors) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("Quais os sabores de Pizza que Você deseja?");
            System.out.println("[1] - 5 Queijos");
            System.out.println("[2] - Frango Catupiry ");
            System.out.println("[3] - Cheddar ");
            System.out.println("[4] - Calabresa");
            System.out.println("[5] - Chocolate ");
            System.out.println("[6] - Prestigio ");
            System.out.println("[7] - Salmao com alcaparras ");
            System.out.println("[8] - Camarao ");
            System.out.println("[9] - Abacaxi com Canela ");
            System.out.println("Digitalize o numero do sabor desejado da pizza: ");
            flavor.selectFlavor(entrada2.nextInt());
            x++;
        }
        //Adicinar Bebida
        if (sizePizza.Validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Deseja adicionar borda?");
        System.out.println("[1] - Sim");
        System.out.println("[2] - Nao");
        edgeFlavor.validarBorda(entrada3.nextInt());
        }else{
            
        }

        double valor;
        if (edgeFlavor.validador == 1) {
            valor = sizePizza.Valuewithborder;
        } else {
            valor = sizePizza.valueSize;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Deseja adicionar alguma bebida?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");

            drink.validarDrink(entrada4.nextInt());
        }

        valorTotal = valor + flavor.valorSabor + edgeFlavor.valorBorda + drink.valorDrink;

        System.out.println("O tamanho da pizza escolhido foi : " + sizePizza.Size);
        System.out.println("Os sabores Selecionados foram: " + flavor.listaSabores);
        System.out.println("A borda Selecionada foi: " + edgeFlavor.border);
        System.out.println("A ou as Bebidas escolhidas foi: " + drink.listaBebidas);
        System.out.println("O Valor total do pedido foi: " + valorTotal);

    }
}

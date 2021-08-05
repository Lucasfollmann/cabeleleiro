/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

/**
 *
 * @author Lucas
 */
public class Cabelo {

    int amountcabelo;
    double valueSize;
    double Valuewithborder;
    String Size;
    int Validador = 0;
    Barba edgeflavor = new Barba();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                amountcabelo = 5;
                Size = "careca";
                valueSize = 75;
                Valuewithborder = 80;
                break;

            case 2:
                amountcabelo = 4;
                Size = "degradê";
                valueSize = 66;
                Valuewithborder = 69.5;
                break;

            case 3:
                amountcabelo = 3;
                Size = "moicano";
                valueSize = 52;
                Valuewithborder = 56.5;
                break;

            case 4:
                amountcabelo = 3;
                Size = "dreadloks";
                valueSize = 42;
                Valuewithborder = 44.5;
                break;

            case 5:
                amountcabelo = 2;
                Size = "social";
                valueSize = 28;
                Validador = 1;
                break;
        }
        return amountcabelo;
    }
}

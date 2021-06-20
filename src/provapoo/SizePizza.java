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
public class SizePizza {

    int amountofflavors;
    double valueSize;
    double Valuewithborder;
    String Size;
    int Validador = 0;
    EdgeFlavor edgeflavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                amountofflavors = 5;
                Size = "Gigante";
                valueSize = 75;
                Valuewithborder = 80;
                break;

            case 2:
                amountofflavors = 4;
                Size = "Familia";
                valueSize = 66;
                Valuewithborder = 69.5;
                break;

            case 3:
                amountofflavors = 3;
                Size = "Media";
                valueSize = 52;
                Valuewithborder = 56.5;
                break;

            case 4:
                amountofflavors = 3;
                Size = "Pequena";
                valueSize = 42;
                Valuewithborder = 44.5;
                break;

            case 5:
                amountofflavors = 2;
                Size = "Broto";
                valueSize = 28;
                Validador = 1;
                break;
        }
        return amountofflavors;
    }
}

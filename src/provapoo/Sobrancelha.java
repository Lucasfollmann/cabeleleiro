/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Sobrancelha {

    double valorSobrancelha;
    Cabelo size = new Cabelo();
    ArrayList<String> listaSobrancelha = new ArrayList();

    Kit order = new Kit();

    public ArrayList selectSobrancelha(int op) {

        switch (op) {
            case 1:
                listaSobrancelha.add("risquinho");
                break;
            case 2:
                listaSobrancelha.add("sobrancelha comum");
                break;
            case 3:
                listaSobrancelha.add("rena");
                valorSobrancelha += 10.00;
                break;
            
        }

        return listaSobrancelha;
    }

}
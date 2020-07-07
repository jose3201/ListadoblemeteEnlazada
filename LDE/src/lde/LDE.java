/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lde;

/**
 *
 * @author josed
 */
public class LDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaD n= new ListaD();
        n.InsertarUltimo(15);
        n.InsertarUltimo(20);
        n.InsertarUltimo(30);
        n.InsertarUltimo(8);
        n.InsertarUltimo(19);
        n.InsertarUltimo(31);
        n.InsertarUltimo(32);
        n.imprimir();
        n.Eliminar(8);
        n.imprimir();
        
    }
    
}

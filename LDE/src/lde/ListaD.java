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
public class ListaD {

    private Nodo primero;
    private Nodo ultimo;
    private int tama;

    public ListaD() {
        this.primero = null;
        this.tama = 0;
    }

    public void InsertarUltimo(int d) {
        Nodo nuevo = new Nodo(d);
        if (primero == null) {
            primero = nuevo;
            tama++;
        } else if (tama == 1) {
            ultimo = nuevo;
            primero.setSiguiente(ultimo);
            ultimo.setAnterior(primero);
            tama++;
        } else {
            Nodo aux = ultimo;
            ultimo = nuevo;
            aux.setSiguiente(ultimo);
            ultimo.setAnterior(aux);
            tama++;
        }
    }

    private Nodo Buscar(int d) {
        Nodo aux = primero;
        if (primero != null) {
            while (aux!=null) {                
                if (aux.getDato()==d) {
                    return aux;
                }
                aux=aux.getSiguiente();
            }
        } else {
            System.out.println("Lista vacia");
            return null;
        }
    return null;
    }
    public void Eliminar(int d){
        if (primero!=null) {
            Nodo aux=Buscar(d);
            if (aux!=null) {
                if (aux.getAnterior()==null) {
                    primero=primero.getSiguiente();
                    primero.setAnterior(null);
                    tama--;
                } else if (aux.getSiguiente()==null) {
                    Nodo auxa=aux.getAnterior();
                    auxa.setSiguiente(null);
                    aux.setAnterior(null);
                    tama--;
                }else{
                    Nodo auxant=aux.getAnterior(), auxsig=aux.getSiguiente();
                    aux.setAnterior(null);
                    aux.setSiguiente(null);
                    auxant.setSiguiente(auxsig);
                    auxsig.setAnterior(auxant);
                    tama--;
                }
            } else {
                System.out.println("dato no existe");
            }
        } else {
            System.out.println("Lista vacia");        
        }
    }
    public void  imprimir(){
        if (primero!=null) {
        Nodo aux=primero;
            while (aux!=null) {                
                System.out.print(" Dato:"+aux.getDato()+"->");
                aux=aux.getSiguiente();
            }
            System.out.println("");
            System.out.println("Tamaño: "+tama);
        }else{
            System.out.println("Lista vacia");
        }
    }
}

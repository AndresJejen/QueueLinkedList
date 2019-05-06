/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author gjejen
 */
public class ChainNode<T> {
    
    private T element;

    private ChainNode<T> next;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public ChainNode<T> getNext() {
        return next;
    }

    public void setNext(ChainNode<T> next) {
        this.next = next;
    }
    
    ChainNode(){
        this.element = null;
        this.next = null;
    }
    
    ChainNode (T element){
        this.element = element;
        this.next = null;
    }
    
    ChainNode(T element, ChainNode<T> next){
        this.element = element;
        this.next = next;
    }
    
}

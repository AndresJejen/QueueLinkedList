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
public class LinkedStack<T> implements QueueI<T> {
   
    protected ChainNode<T> frontNode;
    protected ChainNode<T> rearNode;

    protected int length;
    
    public int getLength() {
        return length;
    }
    
    public LinkedStack () {
        this.length = 0;
    }
   
    
    //métodos
    
    @Override
    public boolean isEmpty(){
        return frontNode == null;
    }
    
    @Override
    public T getFrontElement(){
        return isEmpty() ? null : frontNode.getElement();
    }
    
    @Override
    public T getRearElement(){
        return isEmpty() ? null : rearNode.getElement();
    }
    
    @Override
    public void put (T theobject){
        ChainNode<T> p = new ChainNode<T> (theobject,null);
        this.length += 1;
        if(frontNode == null) frontNode = p;
        else rearNode.setNext(p);
        
        rearNode = p;
    }
    @Override
    public T remove(){
        if( isEmpty()) return null;
        T frontElement = frontNode.getElement();
        frontNode = frontNode.getNext();
        this.length -= 1;
        if(isEmpty()) rearNode = null;
        
        return frontElement;
    }
    
    
}

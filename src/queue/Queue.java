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
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         LinkedStack<Integer> s = new LinkedStack<>();
        
        s.put(new Integer (1) );
        s.put(new Integer (2) );
        s.put(new Integer (3) );
        s.put(new Integer (4) );
        
        while (!s.isEmpty()){
            System.out.println("Top element is " + s.getFrontElement());
            System.out.println("Rear element is " + s.getRearElement());
            System.out.println("Removed element is " + s.remove());
            System.out.println("length is " + s.getLength());
        }
        
    }
    
}

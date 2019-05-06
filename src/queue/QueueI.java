/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author gjejen
 * @param <T>
 */
public interface QueueI<T> {
    boolean isEmpty();
    T getFrontElement();
    T getRearElement();
    void put (T theobject);
    T remove();
}

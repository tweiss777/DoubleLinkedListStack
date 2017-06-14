/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tweis
 * @param <T>
 */
public class DoubleNode <T> {
    //fields
    T data;
    DoubleNode<T> next = null;
    DoubleNode<T> prev = null;
    //------------------------

    public DoubleNode(T data) {
        this.data = data;
    }
    
    public DoubleNode(T data, DoubleNode<T> next, DoubleNode<T> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    
    
}

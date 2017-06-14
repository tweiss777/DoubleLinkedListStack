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
public class Stack <T> {
    private DoubleNode top = null;
    private DoubleNode head = null;
    
    
    

    //Add an isEmpty method
    public boolean isEmpty(){
        return top == null;
    }
    
    //Add an add method
    public void add(T data){
        if(isEmpty()){
            head = new DoubleNode(data);
            top = head;
        }
        else{
            DoubleNode addedNode = top;
            top.next = addedNode;
            top = new DoubleNode(data, head, top);
        }
    }
     
    //add a pop method
    public DoubleNode pop(){
        DoubleNode poppedNode = null;
        if(isEmpty())return null;
        else{
            poppedNode = top;
            top = top.prev;
            top.next = null;
        }
        
        return poppedNode;
    }
    
    
    //Add a retrieve method (Note peek at top of stack only
    public void showTop(){
        if(!isEmpty()) System.out.println(top.data);
       
    }
    
    
    
    public static void main(String args[]){
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.add(1);
        myStack.add(2);
        DoubleNode poppedNode = myStack.pop();
        System.out.println("Popped node: " + poppedNode.data);
        myStack.showTop();
    }
            
    
   
    
    
    
}

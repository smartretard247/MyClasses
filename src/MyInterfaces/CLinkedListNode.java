/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyInterfaces;

/**
 *
 * @author Jeezy
 * @param <T>
 */
public class CLinkedListNode<T> {
    public T a; //an object being held
    public CLinkedListNode next; //pointer to the next element
    public boolean hasNext() {
        return next != null;
    }
}

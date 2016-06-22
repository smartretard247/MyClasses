/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInterfaces;

import java.util.ArrayList;

/**
 *
 * @author Jeezy
 */
public interface IGameObject<T,String> {
    T loadVariables(ArrayList<String> from);
    Boolean matchProperty(String with);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtp;

/**
 *
 * @author dell
 */
public class DiffrenteTailleException extends Exception{

    public DiffrenteTailleException() {
        System.out.println("DiffrenteTailleException !!! la taille de tableau en entré n'est pas valide");
        this.printStackTrace();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosci;

import java.util.Random;

/**
 *
 * @author Spiritus
 */
public class Kostka {
    private int number=0;
    
    public void random ()
    {
        Random generator=new Random();
        number=generator.nextInt(6)+1;
        System.out.println("wylosowano:"+number);
    }
    public int Retnumber()
    {
        return number;
    }
    
    
}

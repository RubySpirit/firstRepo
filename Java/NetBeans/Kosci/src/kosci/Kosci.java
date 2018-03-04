/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosci;
import kosci.Player;
import kosci.Tabela;
/**
 *
 * @author Spiritus
 */
public class Kosci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Player gracz=new Player();
        gracz.losuj();
        gracz.ViewCube();
        
        if(gracz.Zamien(3)==true)
            System.out.println("Wszystko poszlo ok :D");
        gracz.ViewCube();
       
        
       if(gracz.Zamien(3,5)==true)
           System.out.println("Wszystko poszlo ok :D");
        gracz.ViewCube();
              if(gracz.Zamien(3,5,1,2,4)==true)
           System.out.println("Wszystko poszlo ok :D");
        gracz.ViewCube();
        Tabela tab=new Tabela(2);
        tab.wypisztabele();
        
    }
  }

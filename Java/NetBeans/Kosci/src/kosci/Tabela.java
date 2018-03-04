/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosci;

/**
 *
 * @author Spiritus
 */
public class Tabela {
private   int[][] tabelka;
private int liczbagraczy;
    public Tabela(int LiczbaGraczy)
    {
        liczbagraczy=LiczbaGraczy;
        tabelka=new int[LiczbaGraczy][16];
        
    }
    void dodajkosci(Kostka kosc,int rodzaj)

   void wypisztabele()
   {
       String nazwy[]={"jedynki","dwojki","trójki","czwórki","piątki","szóstki","premia","suma","3 jednakowe","4 jednakowe","ful","mały strit","duży strit","generał","szansa","suma","razem"};
      
       for(int i=0;i<16;i++)
       {
           System.out.print(" "+nazwy[i]+" ");
           for(int j=0;j<liczbagraczy;j++)
           {
               System.out.print(tabelka[j][i]+" ");
           }
           System.out.println();
       }
   }
}

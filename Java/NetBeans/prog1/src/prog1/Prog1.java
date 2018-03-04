/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;


public class Prog1 {
public static void wypisz(int[] A,int n)
{
for(int i=0;i<n;i++)
{
System.out.print(A[i]+" ");
}
System.out.println();
}
    
    public static void main(String[] args) {
        int n=5;
        int x;
        int i;
        int[] tabl={7,3,8,5,2};
        for(int j=1;j<n;j++)
        {
            x=tabl[j];
            i=j-1;
            while(i>=0 &&tabl[i]>x)
            {
                tabl[i+1]=tabl[i];
                i--;
            }
            tabl[i+1]=x;
            wypisz(tabl,n);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosci;
import kosci.Kostka;
/**
 *
 * @author Spiritus
 */
public class Player {
    private Kostka[] kosci=new Kostka[6];
    public void losuj(){
        for (int i =0;i<6;i++)
        {  
            Kostka a=new Kostka();
            a.random();
            kosci[i]=a;
        }
    }
    public void ViewCube(){
        System.out.println("Wylosowane kosci mają:");
        for (int i=0;i<6;i++)
        {
            System.out.print(kosci[i].Retnumber()+" ");
        }
    }
    
    public boolean Zamien(int a)//zwraca TRUE gdy podmiana jest mozliwa
    {
        if(a>0&a<7)
        {
        kosci[a-1].random();
        return true;
        }
        else          
        return false;
        
    }
    public boolean Zamien(int a,int b)//zwraca TRUE gdy podmiana jest mozliwa
    {
       if(a>0&a<7&b>0&b<7&b!=a)
       {
           kosci[a-1].random();
           kosci[b-1].random();
           return true;
       }
       else 
           return false;
    }
     public boolean Zamien(int a,int b,int c)//ponowne losowanie 3 wybranych kosci
    {         
         if(a>0&a<7&b>0&b<7&c>0&c<7&a!=b&b!=c&c!=a)
       {        
        kosci[a-1].random();
        kosci[b-1].random();
        kosci[c-1].random();
        return true;
       }
         return false;
    }
     public boolean Zamien(int a,int b,int c,int d)//ponowne losowanie 4 wybranych kosci
    {        
         if(a>0&a<7
           &b>0&b<7
           &c>0&c<7
           &d>0&d<7
           &a!=b&a!=c&a!=d
           &b!=c&b!=d
           &c!=d)
       {        
        kosci[a-1].random();
        kosci[b-1].random();
        kosci[c-1].random();
        kosci[d-1].random();
        return true;
       }
         return false;
    }
      public boolean Zamien(int a,int b,int c,int d, int e)//ponowne losowanie 5 wybranych kosci
    {         
         if(a>0&a<7
           &b>0&b<7
           &c>0&c<7
           &d>0&d<7
           &e>0&e<7
           &a!=b&a!=c&a!=d&a!=e
           &b!=c&b!=d&b!=e
           &c!=d&c!=e
           &d!=e)
       {
        kosci[a-1].random();
        kosci[b-1].random();
        kosci[c-1].random();
        kosci[d-1].random();
        kosci[e-1].random();
        return true;
       }
         return false;
    }
}

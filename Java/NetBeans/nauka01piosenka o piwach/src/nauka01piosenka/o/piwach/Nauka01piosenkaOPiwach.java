/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nauka01piosenka.o.piwach;

import static java.lang.Character.UnicodeBlock.of;

/**
 *
 * @author Spiritus
 */
public class Nauka01piosenkaOPiwach {


 public static void main(String[] args) {

 int iloscButelek = 99;
 String slowo = "bottles";
 while (iloscButelek > 0) {
 if (iloscButelek == 1) {
slowo = "bottle"; // liczba pojedyncza
 }
 System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
 System.out.println(iloscButelek + " " + slowo + " of beer.");
 System.out.println("Take one down.");
 System.out.println("Pass it around.");
 iloscButelek = iloscButelek - 1;
 if (iloscButelek > 0) {
System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
 } else {
System.out.println("No more bottles of beer on the wall");
 } // koniec else
 } // koniec while
 } // koniec metody main
} // koniec klasy
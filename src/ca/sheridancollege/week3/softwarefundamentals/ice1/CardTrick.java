/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;


import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author jyoti
 * student Id:991628078
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        System.out.println("Enter a card value batween 1 to 13");
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13 + 1));
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            System.out.println(c.getSuit()+ "" + Integer.toString(c.getValue()));
            magicHand[i]= c;
        
          
            
         //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a cart suit");
        System.out.println(" 1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs");
        
        
        int inputSuit, inputValue;
        {
        boolean handCard= false;
        Card luckyCard=new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");
        }
        System.out.println("Enter a card value between 1 to 13");
         String suitStr = scanner.nextLine();
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

    
    
}

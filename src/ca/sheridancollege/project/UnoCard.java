/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author kosti
 */
public class UnoCard extends Card{

    UnoCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    enum Color{RED,GREEN,BLUE,YELLOW};
    enum Number{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TWOPLUS,REVERSE,SKIP};
    enum cardType{NUMBER,REVERSE,TWOPLUS,SKIP,WILDCARD,FOURPLUS};

    private Color color;
    private Number number;
    private cardType cardType;
    
   
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the number
     */
    public Number getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Number number) {
        this.number = number;
    }

    /**
     * @return the cardType
     */
    public cardType getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(cardType cardType) {
        this.cardType = cardType;
    }
    
}
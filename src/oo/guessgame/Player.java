package oo.guessgame;

public class Player {
    private int number = 0;
    
    public int getNumber(){
        return this.number;
    }
    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }
}

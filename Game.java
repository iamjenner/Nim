/*****************************************
 * A template for a Nim game
 ****************************************/ 

public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    
    public Game(int difficulty){
        
        marbles = (int)(Math.random()*91) + 10;
        humanPlayer = new Human();
        computerPlayer = new Computer(difficulty);
        
    }
    
    /* play is a method that simulates a game of Nim between humanPlayer and computerPlayer
     */
    public void play(){
        System.out.println("There are " + marbles + " marbles.");
        int turn = (int)(Math.random()*2);
        while(marbles > 1){
            if(turn == 0){ // human turn
                System.out.println("\nIt is your turn...");
                System.out.println("Remember you must take between 1 and " + marbles/2 + " marbles.");
                 humanPlayer.move();
                while(!(humanPlayer.getChoice() >= 1 && humanPlayer.getChoice() <= marbles/2)){
                    System.out.println("Choose between 1 and " + marbles/2 + " marbles.");
                   humanPlayer.move(); 
                }
                marbles -= humanPlayer.getChoice();
                System.out.println("There are " + marbles + " marbles left.");
                turn++;
            }
            else{ // turn is 1 & computer turn
                System.out.println("\nIt is the computer's turn...");
                computerPlayer.move(marbles);
                marbles -= computerPlayer.getChoice();
                System.out.println("There are " + marbles + " marbles left.");
                turn--;
            }
        }

        if(turn == 0){
            System.out.println("\nYou lose!");
        }
        else{
            System.out.println("\nYou win!!");
        }
            
        }
       
    }

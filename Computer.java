/*****************************************
 * A template for a computer Nim player
 ****************************************/ 

public class Computer{
    
    private int mode;
    private int choice;
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft){
        if(mode == 1){ // stupid mode
            choice = (int)(Math.random()*(marblesLeft/2)) + 1;

        } else{ // smart mode
            int p = 2;
            while(p < marblesLeft){
                p *= 2;
            }

            p = (p/2)-1;
           if(p == marblesLeft){
                choice = (int)(Math.random()*(marblesLeft/2)) + 1;
           } else {
            choice = marblesLeft - p;

           }
        }
        
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}

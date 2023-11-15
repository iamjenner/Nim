# Nim
The game of Nim. This is a well-known game with a number of variants. The fol- lowing variant has an interesting winning strategy. Two players alternately take marbles from a pile. In each move, a player chooses how many marbles to take. The player must take at least one but at most half of the marbles. Then the other player takes a turn. The player who takes the last marble loses.


    The Game.java class is a class that simulates the Nim game.
    It has three instance variables: marbles, humanPlayer, and computerPlayer.
    marbles is an integer which represents the number of marbles the game will start with. When a new Game is created, 
    marbles is initialized with a random integer between 10 and 100.
    humanPlayer is a Human who represents the user playing the game.
    computerPlayer is a Computer who plays against humanPlayer.
    The play() method is a method within the Game class that implements the Nim game. To determine who takes
    the first turn, a random number between 0 and 1 is generated. 0 indicates that it is the Human turn, and 1 
    indicates that it is the Computer turn. While the number of marbles is greater than one, the Human and the
    Computer alternate turns. When it is the human's turn, the system tells the Human that it is their turn and
    prompts them to choose between 1 and marbles/2. If the Human choose a number that is exceeds  the bounds, 
    the system continues to prompt the Human for a choice within the bounds until the choice is valid. Their choice
    is then subtracted from the remaining marbles. When it is the Computer's turn, the system informs the use that
    it is the computer's turn, and the computer takes marbles based on its difficulty. Whenever a player has a turn, 
    the user is informed of how many marbles are left. Once there is one marble left, depending on whose turn it is, the 
    Human or the Computer loses. 

    The Computer.java class is a class that represents a Computer that plays against a Human in the Nim game.
    It has two instance variables: mode and choice.
    When a Computer is created, the user must initialize the mode, which represents the difficulty level the 
    Computer will play on. 1 is stupid mode, and 2 is smart mode. Choice is automatically initialized to -1 because
    there are no marbles to choose from yet. 
    The move(int marblesLeft) method simulates the Computer making a move in the Nim game. If the Computer is playing on 
    stupid mode, the Computer will choose a random number between 1 and marblesLeft/2 as its choice. If the computer is 
    playing on smart mode, it will choose a number of marbles that will make the number of marbles left one less than a 
    power of two. To make this possible, I first found the largest power of two that could be made out of the remaining 
    marbles and subtracted one from that number which is named p. If p was equal to the number of marblesLeft, 
    then the Computer  simply chooses a random number between 1 and marblesLeft/2 as its choice. If it was not equal, the 
    Computer chooses p - marblesLeft as its choice.
    The getChoice() method returns the choice of the Computer.

    The Human.java class is a class that represents the Human that plays against a Computer in the Nim game. 
    It has two instance variables: choice and input.
    choice is initialized to -1 because there are no marbles to choose from yet. input is a Scanner to read
    the user's input. 
    The move() method simulates the Human making a move in the Nim game. It reads the user's input and sets choice to
    the integer they input.
    The getChoice() method returns the choice the Human made.

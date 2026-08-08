public static void main (String[] args)
  int numofGuesses = 4;
  int[] board = 0,1,2,3,4,5,6;
  int board_max = 7;
  int Hits = 0;
  int Misses = 0;
  // sevel virtual locations on the board
  COMPUTE a random number between 0 and 4 that will be the starting location cell position
  // so if it's position 4 it will be 4,5,6, etc
  
  WHILE loop for if the numofGuesses is > 0 

    USER enters a guess between 0 to 6 

    ARRAY board is checked for a match, if matched a hit 
      ELSE miss 
      ELSE kill if 3 a row are hit, then BREAK the loop
      DECREMENT numofGuesses
      EXIT the loop when four guesses are given or kill is achieved

  
  
  

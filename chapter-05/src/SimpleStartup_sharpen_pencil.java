SET numOfGuesses to 0
SET numOfHits to 0

COMPUTE a random starting location between 0 and 4

SET Startup locations to:
    starting location
    starting location + 1
    starting location + 2

WHILE Startup has not been killed

    ASK user for a guess between 0 and 6

    INCREMENT numOfGuesses

    CHECK guess against Startup locations

    IF guess matches an un-hit Startup location
        DISPLAY "hit"
        MARK that location as hit
        INCREMENT numOfHits

        IF numOfHits equals 3
            DISPLAY "kill"
            EXIT loop

    ELSE
        DISPLAY "miss"

DISPLAY number of guesses
  
  
  

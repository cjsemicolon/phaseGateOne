const prompt = require("prompt-sync")() 

        let count = 0;
        
        while (true) {
            const number = Math.floor(Math.random() * 100) + 1
            let attempts = 0;
            let correctGuess = false;

            while (attempts < 5) {

                const guess = +prompt("Guess the number: ");

                if (guess < 1 || guess > 100) {

                   console.log("Invalid number ");                    

                }else{

                     attempts++;


                }

                if (guess == number) {

                    console.log("Correct");

                    count++;

                    correctGuess = true;

                    break;

                } else if (guess < number) {

                   console.log("Too low");

                } else {

                    console.log("Too high");
                }
            }

            if (!correctGuess) {

                console.log("Failed. The number was " + number );
            }

           console.log("Score: " + count);

            
            response = prompt("Care to go another round??? (yes/no): ");

            if (response !== "yes") {

                console.log("Thanks for playing! Final score: " + count);

                if(attempts == 1) {
        
                    console.log("Legendary!!!");

                }else if(attempts == 2) {

                   console.log("Excellent");
            
                }else if(attempts > 2 && attempts < 5) {

                    console.log("Good");
            
               }else if(attempts == 5) {

                    console.log("Close");

               }else{

                    console.log("Better luck");
               
               }

                break;
            }
        }
        


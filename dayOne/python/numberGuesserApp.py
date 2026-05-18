import random
count = 0;
        
while True: 
    number = random.randint(1, 100)
    attempts = 0;
    correctGuess = False;

    while attempts < 5:

        guess = int(input("Guess the number: "))

        if (guess < 1 or guess > 100): 

            System.out.print("Invalid number ")                    

        else:

            attempts += 1;

        if (guess == number):

            print("Correct");

            count += 1

            correctGuess = True;

            break;

        elif (guess < number):

            print("Too low")

        else:

            print("Too high")



        if not (correctGuess):

            print("Failed. The number was ", number );

            print("Score: ", count);

        response = input("Care to go another round??? (yes/no): ");

        if not (response == "yes"):

            print("Thanks for playing! Final score: ", count);

        if(attempts == 1):

            print("Legendary!!!");

        elif(attempts == 2):

            print("Excellent");

        elif(attempts > 2 and attempts < 5): 

            print("Good");

        elif(attempts == 5): 

            print("Close");

        else:

            print("Better luck");



    break;

        
        
    

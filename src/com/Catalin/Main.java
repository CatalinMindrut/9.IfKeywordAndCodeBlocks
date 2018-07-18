package com.Catalin;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
         int bonus = 100;
        if (score == 5000){
            System.out.println("Your score was 5000");
        }
        /** Codeblocks are defined by braces {}. In the example above a codeblock starts after the if statement and ends
         * after the print out.
         * This means that the code found in the code block will only be executed if the "if" statement is validated, separate
         * from the rest of the code.
         * Having only one line of code does not necessarily require the use of a codeblock.
         */

        if (score == 4000)
            System.out.println("Your score was 5000");
            System.out.println("This was executed");
        /** Java will process one line at a time if a code block isn't created. In the example above, Java will run each line
         * at a time. This means that the if conditional code is not valid, so the second line is not printed, but the 3rd line
         * is going to be printed because judging by the order, only the second line was tied in with the if statement.
         * if you would form a code block, including both print outs, none of them will be printed if the if statement is
         * invalid. Example:
         */
        if (score == 3000){
            System.out.println("This is the first line");
            System.out.println("This is the second line");
        }
        /**Using a codeblock, especially when having only one line of code, is not necessary but it does make the code
         * clearer.
         */

        if (score < 5000){
            System.out.println("Your score is less than 5000");
        } else {
            System.out.println("Got here");
        }
        /**This translates to: if the statement is true, print the first line, in any other case, print the second line.
         * Because there is no other condition, means that in all other circumstances, the second line should be processed.
         * If the statement is true, the first line is printed and the else statement is ignored.
         */

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        }else {
            System.out.println("Got here");
        }
        /** You can have subsequent else statements, including additional if statements as in the example above. Java will
         * run through each statement until a valid one is found. In this case, the if statement is invalid, the else if is
         * invalid as well so the last else (in any other case) is processed and the output is printed.
         */

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//        int savedFinalScore = finalScore; //remove comment
        /**The codeblock can access variables created outside the block, as shown in the example above, the second line uses
         * finalScore which was defined at the top of the page.
         * The reverse is not possible, variables that were created inside the codeblock can not be accessed from outside.
         * In the above example, finalScore was created withing the codeblock and attempting to use that variable outside
         * it will trigger warning.
         * The problem is that every variable created inside a codeblock is being deleted as soon as the codeblock was
         * processed by the computer.
         * The concept of variables inside of a codeblock is called SCOPE.
         */

        boolean test = false;
        if (test){
            System.out.println("This worked");
        }
        /**If you are only using the variable name, Java will verify if the variable the value set to true. In this case it is not
         * so the print out will not be processed.
         */

        //Challenge
        //Print out a second score on the screen with the following:
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure that the first printout above still displays as well
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver){
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your second score was " + secondFinalScore);
        }
        /** The variables were already defined at the beginning of the code so you can just set a new value for each
         * variable without stating the data type once more.
         * The disadvantages with this solution are:
         * -- The gameOver variable is reused and this means that it will have the same value in both cases.
         * -- The rest of the variables are reused and new values have been assigned for each. This means that in future
         * code you can only use the latest values assigned to the variables. You can't used the first values because
         * there is no record for those.
         * -- The code is duplicated. This means that each time you wish to make a change, you will have to make it in
         * more than one place. If you forget that the code is duplicated you might forget to change the values one place
         * and end up with different results.
         */
        /** To be continued...
         */
    }
}

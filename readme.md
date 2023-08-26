# Roll the Die Game README

## Introduction

The "Roll the Die" program is a simple Java application that simulates a dice game. In this game, players roll a six-sided die multiple times, attempting to reach or surpass a specific target value. The program tracks players' progress and provides messages based on the outcomes.

## Overview

This README provides an overview of the "Roll the Die" program, explaining its purpose, functionality, and how to use it.

## Functionality

The program's functionality can be summarized as follows:

1. **Dice Rolling**: The program simulates rolling a six-sided die multiple times. The number rolled on the die is generated randomly using Java's `Random` class.

2. **Target Value**: The target value for the game is set to 5. Players aim to either reach this value or surpass it through their dice rolls.

3. **Player Progress**: The program keeps track of the player's progress relative to the target value. It calculates the difference between the player's current position and the target value.

4. **Messages**: The program provides messages based on the player's progress:
   - If the player reaches the target value, a "Congratulations, you won the game" message is displayed.
   - If the player surpasses the target value, a message indicating how far ahead of the target the player is will be shown.
   - If the player is behind the target value, a message indicating the number of spaces they are behind will be displayed.

## How to Use

To use the program:

1. **Compile**: Ensure you have the Java Development Kit (JDK) installed. Compile the program using the provided `rollthedie.java` file:
   ```shell
   javac rollthedie.java
   ```

2. **Run**: Execute the compiled program:
   ```shell
   java rollthedie
   ```

3. **Gameplay**: The program will simulate dice rolls and display the player's progress and chances remaining.

4. **Outcome**: Based on the outcome, the program will display relevant messages.

## Example Output

Example output from the program:
```
you are 3 spaces behind with 5 chances left
you are 2 spaces behind with 4 chances left
you are 4 spaces behind with 3 chances left
you are 2 spaces behind with 2 chances left
you are 4 spaces behind with 1 chances left
```

## Purpose

The "Roll the Die" program serves as a basic illustration of random number generation and simple game logic in Java programming. It can be used for educational purposes to understand these concepts and can be extended for more complex game development projects.

## Conclusion

The "Roll the Die" program offers a straightforward way to explore dice rolling, randomization, and basic game mechanics. By following the provided instructions, users can experience the simulation and observe how player progress and outcomes are managed.

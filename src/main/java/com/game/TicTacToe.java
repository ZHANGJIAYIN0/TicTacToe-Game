package com.game;

import java.util.Scanner;

/**
 * Entity class of TicTacToe, which is also the core class of the game
 */
public class TicTacToe {

    private Player player1;  // Player 1
    private Player player2;  // Player 2
    private Player currentPlayer;  // Current player in the game (Player 1 or player 2)
    private Board board;  // Board in the game

    /**
     * Constructor
     */
    public TicTacToe() {

    }

    /**
     * Game process
     */
    public void start() {

    }

    /**
     * Switch current player
     */
    protected void switchCurrentPlayer() {

    }

    /**
     * Check whether the winner of game can be determined
     * i.e. Same pieces in a row, or a column, or at main diagonal, or at sub diagonal
     * Attention: For convenience of testing the application, the permission modifier of the method
     * should use protected instead of private
     */
    protected boolean hasWinner() {
        return true;
    }
}

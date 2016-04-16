package assignment4;

import javax.swing.JFrame;

abstract public class AbstractGameStage extends JFrame{
	public int currentscore;
	public int scoretowin;
	public int gssize = 1000;
	public AbstractGameStage(){
		setSize(gssize, gssize);
	}
	public void start(Thread t){
		t = new Thread();
		t.start();
	}
	public void restart(){
		
	}
	public void addScore(){
		currentscore = currentscore + 10;
	}
	public int getScore(){
		return currentscore;
	}
	public void setWinScore(int a){
		scoretowin = a;
	}
}
/*
a. The basic attributes of a game stage: current score, the score to win the game, and the
size/dimension of a game stage.
b. The basic control of a game stage, these abstract methods should be implement in the
child class of AbstractGameStage:
1. start: for create a game thread to start the game
2. replay : restart the game
3. addScore: when player pass a challenge, add score
4. getScore
5. setWinScore
*/
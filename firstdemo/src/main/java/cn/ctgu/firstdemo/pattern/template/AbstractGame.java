package cn.ctgu.firstdemo.pattern.template;

public abstract class AbstractGame {

    public abstract void initalizeGame();
    public abstract void startGame();
    public abstract void endGame();

    public final void playGame(){
        initalizeGame();
        startGame();
        endGame();
    }
}

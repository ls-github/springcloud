package cn.ctgu.firstdemo.pattern.template;

public class BasketballGame extends AbstractGame {
    @Override
    public void initalizeGame() {
        System.out.println("初始化：篮球游戏！");
    }

    @Override
    public void startGame() {
        System.out.println("开始：篮球游戏！");
    }

    @Override
    public void endGame() {
        System.out.println("结束：篮球游戏！");
    }
}

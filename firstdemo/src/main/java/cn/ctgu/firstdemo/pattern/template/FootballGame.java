package cn.ctgu.firstdemo.pattern.template;

public class FootballGame extends AbstractGame{
    @Override
    public void initalizeGame() {
        System.out.println("初始化：足球游戏！");
    }

    @Override
    public void startGame() {
        System.out.println("开始：足球游戏！");
    }

    @Override
    public void endGame() {
        System.out.println("结束：足球游戏！");
    }
}

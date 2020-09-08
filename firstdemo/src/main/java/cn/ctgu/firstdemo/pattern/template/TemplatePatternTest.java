package cn.ctgu.firstdemo.pattern.template;

public class TemplatePatternTest {
    public static void main(String[] args) {
        AbstractGame footballGame=new FootballGame();
        footballGame.playGame();
        System.out.println("======================");
        AbstractGame basketballGame=new BasketballGame();
        basketballGame.playGame();
    }
}

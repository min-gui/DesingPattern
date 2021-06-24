package templateMethod;

public class Player {
    private PlayerLevel level;


    public Player(){
        level= new BeginnerPlayerLevel();
        System.out.println("플레이어가 생성되었습니다.");
        level.showLevelInfo();
    }

    public void play(int count){
        level.go(count);
    }
    public void levelUp(PlayerLevel level){
        this.level = level;
        System.out.println("Level up!!");
        this.level.showLevelInfo();
    }

}

abstract class PlayerLevel{

    protected abstract void walk();
    protected abstract void run();
    protected abstract void jump();
    protected abstract void showLevelInfo();

    void shit(){

    }
    public final void go(int count ){

        walk();
        run();
        for (int i = 0; i< count ; i++){
            jump();
        }
    }
}

class BeginnerPlayerLevel extends PlayerLevel{

    @Override
    protected void walk() {
        System.out.println("천천히 걷는다.");
    }

    @Override
    protected void run() {
        System.out.println("BeginnerPlayer는 달릴 수 없습니다.");
    }

    @Override
    protected void jump() {
        System.out.println("BeginnerPlayer는 점프할 수 없습니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Beginner 레벨입니다. =====");
    }


}

class IntermediatePlayerLevel extends PlayerLevel {

    @Override
    protected void walk() {
        System.out.println("보통 속도로 걷습니다.");
    }

    @Override
    protected void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("IntermediatePlayer는 점프할 수 없습니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Intermediate 레벨입니다. =====");
    }
}

class AdvancedPlayerLevel extends PlayerLevel {

    @Override
    protected void walk() {
        System.out.println("빠르게 걷습니다.");
    }

    @Override
    protected void run() {
        System.out.println("보통 속도로 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("보통 높이로 점프합니다.");
    }

    @Override
    protected void showLevelInfo() {
        System.out.println("===== Advanced 레벨입니다. =====");
    }
}
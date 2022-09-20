package proxy._02_after;


public class GameServiceProxy implements GameService {

    private GameService gameService;

    //프록시에서 리턴 값을 자유자재로 변경할수 있음.
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        //특정한 상황이 되었을때 생성.
        if (this.gameService == null){
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before );
    }
}

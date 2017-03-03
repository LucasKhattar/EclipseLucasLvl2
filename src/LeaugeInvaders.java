import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeaugeInvaders {
public static void main(String[] args) {
	LeaugeInvaders invaders = new LeaugeInvaders();
}
JFrame frame;
GamePanel game;
static final int WIDTH = 500;
static final int HEIGHT = 800;
LeaugeInvaders() {
	frame = new JFrame();
	game = new GamePanel();
	setup();
}
 void setup(){
	 frame.add(game);
	 frame.addKeyListener(game);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 game.startGame();
 }
}

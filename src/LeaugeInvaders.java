import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeaugeInvaders {
public static void main(String[] args) {
	LeaugeInvaders invaders = new LeaugeInvaders();
}
JFrame frame;
GamePanel game;
final int width = 500;
final int height = 800;
LeaugeInvaders() {
	frame = new JFrame();
	game = new GamePanel();
	setup();
}
 void setup(){
	 frame.add(game);
	 frame.addKeyListener(game);
		frame.setVisible(true);
		frame.setSize(width, height);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 game.startGame();
 }
}

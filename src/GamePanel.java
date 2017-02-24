
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
GamePanel(){
	timer = new Timer(1000/60, this);
	gameo = new GameObject();
}
void startGame(){
	timer.start();
}
GameObject gameo;
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	gameo.update();
}
public void paintComponent(Graphics g){
	gameo.draw(g);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("1");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("2");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("3");
}

}

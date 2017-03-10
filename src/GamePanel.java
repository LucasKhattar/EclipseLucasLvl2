
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
Font titleFont;
Font titleFont2;
Font titleFont3;
Rocketship r = new Rocketship(250, 700, 50, 50);
GamePanel(){
	timer = new Timer(1000/60, this);
	titleFont = new Font("Arial",Font.PLAIN,48);
	titleFont2 = new Font("Arial", Font.PLAIN,25);
	titleFont3 = new Font("Arial", Font.PLAIN,25);
}
void startGame(){
	timer.start();
}
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;

void updateMenuState(){
	
}
void updateGameState(){
	r.update();
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeaugeInvaders.WIDTH, LeaugeInvaders.HEIGHT); 
	g.setColor(Color.YELLOW);
	g.setFont(titleFont); 
	g.drawString("LEAGUE INVADERS", 20, 200);
	g.setFont(titleFont2); 
	g.drawString("Press ENTER To Start", 100, 300);
	g.setFont(titleFont3); 
	g.drawString("Press SPACE For Instructions", 70, 400);
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeaugeInvaders.WIDTH, LeaugeInvaders.HEIGHT);  
	r.draw(g);
}
void drawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeaugeInvaders.WIDTH, LeaugeInvaders.HEIGHT);
	g.setColor(Color.BLACK);
	g.setFont(titleFont); 
	g.drawString("GAME OVER", 100, 100);
	g.setFont(titleFont2); 
	g.drawString("You Killed 0 Aliens", 140, 300);
	g.setFont(titleFont3); 
	g.drawString("Press BACKSPACE To Restart", 70, 500);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}

}
public void paintComponent(Graphics g){
	if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
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
	if(e.getKeyCode()==10){
		if(currentState == MENU_STATE){
			currentState = GAME_STATE;
		}
		else if(currentState == GAME_STATE){
			currentState = END_STATE;
		}
		else if(currentState == END_STATE){
			currentState = MENU_STATE;
		}
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("3");
}

}
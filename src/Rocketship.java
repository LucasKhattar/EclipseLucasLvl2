
import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int xSpeed;
	int ySpeed;
Rocketship(int x, int y, int width, int height){
	super();
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
void update(){
	super.update();
	x+=xSpeed;
	y+=ySpeed;
}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}
import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int x;
	int y;
	int width;
	int height;
Rocketship(int x, int y, int width, int height){
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
void update(){
	
}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}









//11. Add an integer member variable to the Rocketship class called speed. 
//
//12. In the Rocketship class constructor, initialize speed to 5.
//CONTINUED ON NEXT PAGE
//
//CHALLENGE! 
//Do not move on until this has been completed.
//
//Add code to your program so that the Rocketship will move with the arrow keys. You will need to use the keyPressed and keyReleased method inside the GamePanel class. You will also need to use the Rocketship's update method along with the speed variable. Feel free to create more variables as needed. There are multiple ways to solve this. Do not move on until the teacher has verified your program.

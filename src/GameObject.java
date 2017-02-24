import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	void update(){
		x+=1;
		y+=1;
	}
	void draw(Graphics graph){
		graph.fillRect(x, y, 100, 100);
	}
}
package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_BOOTS extends SuperObject {
	public OBJ_BOOTS() {
		name = "Boots";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}

import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String source = "thor.ppm";
		Color[][] sourceImage = Runigram.read(source);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage ,targetImage, 50);
	}
}

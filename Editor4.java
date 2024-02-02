import java.awt.Color;

// linoy feedback: I checked 2 HW you did and it was very good! good job :)
public class Editor4 {
    public static void main (String[] args) {
		String source = "thor.ppm";
		Color[][] sourceImage = Runigram.read(source);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage ,targetImage, 50);
	}
}

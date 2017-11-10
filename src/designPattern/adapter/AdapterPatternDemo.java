/**
 * structural design pattern
 */
package designPattern.adapter;

/**
 * @author mandeep
 *
 */
public class AdapterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp4", "despacito.mp4");
		audioPlayer.play("vlc", "Moana.vlc");
		audioPlayer.play("mp3", "Shape of you.mp3");
		audioPlayer.play("xlc", "mjsk.xlc");
	}

}
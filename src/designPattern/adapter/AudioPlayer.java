package designPattern.adapter;

public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equals("mp3"))
			System.out.println("playing mp3: " + fileName);
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else
			System.out.println("invalid media type: "+audioType);
	}

}
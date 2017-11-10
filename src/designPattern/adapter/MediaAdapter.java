package designPattern.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advMediaPlayer;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc"))
			advMediaPlayer.playVLC(fileName);
		else if(audioType.equalsIgnoreCase("mp4"))
			advMediaPlayer.playMP4(fileName);
	}
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc"))
			advMediaPlayer = new VLCPlayer();
		else if(audioType.equalsIgnoreCase("mp4"))
			advMediaPlayer = new MP4Player();
	}

}

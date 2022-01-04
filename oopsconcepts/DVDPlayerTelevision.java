package allinone.oopsconcepts;

//inheritance
public class DVDPlayerTelevision extends Television {

	public DVDPlayerTelevision(double width, double height, double screensize) {
		super(width, height, screensize);
	}
	@Override
	public double channelTuning (int channel) {
		switch(channel){
		case 1: System.out.println("34.56");return 34.56;
		case 2: System.out.println("54.89");return 54.89;
		case 3: System.out.println("73.89");return 73.89;
		case 4: System.out.println("94.98");return 94.98;
		}
		return 0;
	}

public void playDVD() {
		System.out.println("Play DVD");
		
	}

}

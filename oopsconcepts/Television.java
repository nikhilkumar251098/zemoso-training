package allinone.oopsconcepts;

public class Television implements Remote /*extends Remote*/ {
	private double width;
	private double height;
	private double screensize;
	private int maxVolume;
	private int volume;
	private boolean power;
	
	public Television(double width,double height,double screensize){
	this.width=width;
	this.height=height;
	this.screensize = screensize;
	}
	public double channelTuning (int channel) {
		switch(channel){
			case 1: System.out.println("34.56");return 34.56;
			case 2: System.out.println("54.89");return 54.89;
			case 3: System.out.println("73.89");return 73.89;
			case 4: System.out.println("94.98");return 94.98;
		}
		return 0;
	}
	public double channelTuning (String mode) {
		System.out.println(mode + "Mode");
		return 0;
	}
	
	public int decreaseVolume() {
		if(0<volume) volume--;
		return volume;
	}
	public void powerSwitch(){
		this.power=!power;
	}
	public int increaseVolume(){
		if(maxVolume>volume) volume++;
		return volume;
	}
}


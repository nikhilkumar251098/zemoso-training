package allinone.oopsconcepts;

public class Application {

	public static void main(String[] args) {
		
		Television television= new Television(10.5,7,9);
		television.powerSwitch();
		television.channelTuning(1);
		television.increaseVolume();
		television.decreaseVolume();
		//television.width=12; will give compilation error. 
		//Encapsulation is helping in hiding the data.
		DVDPlayerTelevision dvdPlayerTelevision= new DVDPlayerTelevision(10.5,7,9);
		dvdPlayerTelevision.powerSwitch(); 
		dvdPlayerTelevision.channelTuning(2);
		dvdPlayerTelevision.playDVD();
		
		Remote remoteTelevision= new Television(10.5,7,9);
		remoteTelevision.powerSwitch();
		remoteTelevision.increaseVolume();
		remoteTelevision.decreaseVolume();
		remoteTelevision.channelTuning(3);
		
		Television t= new DVDPlayerTelevision(10.5,7,9);
		t.channelTuning(4);
		t.channelTuning("AV");
	}

}

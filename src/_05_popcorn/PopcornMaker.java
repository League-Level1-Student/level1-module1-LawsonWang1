package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn bag = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(bag);
		String minutes = JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?");
		int minsAsInt = Integer.parseInt(minutes);
		microwave.setTime(minsAsInt);
		microwave.startMicrowave();
	}
}

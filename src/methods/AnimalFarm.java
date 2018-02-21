package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {


AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	String input = JOptionPane.showInputDialog(null, "which animal do you wantto hear"); 
	/* 2. Make it so that the user can keep entering new animals. */
	if (input.equals("cow")) {
		playMoo(mooFile);}
	if (input.equals("duck")) {
		playQuack(quackFile);}
	if (input.equals("dog")) {
		playwoof(woofFile);}
	if (input.equals("cat")) {
		playmeow(meowFile);}
	if (input.equals("lama")) {
		playllama(llamaFile);}
}

private void playwoof(Object woofFile) {
	// TODO Auto-generated method stub
	
}

void playMoo(String mooFile) {
	playNoise(mooFile);
}

void playQuack(String quackFile) {
	playNoise(quackFile);
}

void playmeow(String meowFile) {
	playNoise(meowFile);
}
void playllama(String llamaFile) {
	playNoise(llamaFile);


}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}


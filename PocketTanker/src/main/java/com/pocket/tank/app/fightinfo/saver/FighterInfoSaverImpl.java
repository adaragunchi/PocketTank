package com.pocket.tank.app.fightinfo.saver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

public class FighterInfoSaverImpl implements FightInfoSaver {

	private File tempFightInfoFile;
	private File tempFighterFile;
	
	@Override
	public void saveFighter(Fighter fighter) {
		ObjectOutputStream oos;
		try {
			//tempFighterFile = File.createTempFile("fighter", ".txt");
			oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Temp\\fighter.txt")));
			oos.writeObject(fighter);
			oos.flush();
			oos.close();
			//tempFighterFile.deleteOnExit();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void saveFighterInfo(FightInfo fightInfo) {
		ObjectOutputStream oos;
		try {
			//tempFightInfoFile = File.createTempFile("fighterInfo", ".txt");
			oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Temp\\fighterInfo.txt")));
			oos.writeObject(fightInfo);
			oos.flush();
			oos.close();
			//tempFightInfoFile.deleteOnExit();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public FightInfo getFightInfo() {
		FightInfo fightInfo = null;
		try {
			FileInputStream fi = new FileInputStream(new File("C:\\Temp\\fighterInfo.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			fightInfo = (FightInfo) oi.readObject();
			System.out.println("Fighter Profile::"+fightInfo.toString());
			oi.close();
			fi.close();
		} catch (Exception e) {
			System.err.println("No fights found! try playing a fight.\n");
		}
		return fightInfo;
	}

	@Override
	public Fighter getFighter() {
		Fighter fighter = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("C:\\Temp\\fighter.txt"));
			ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
			fighter = (Fighter) objInputStream.readObject();
			System.out.println("Fighter Profile::"+fighter.toString());
			objInputStream.close();
			fileInputStream.close();
		} catch (Exception e) {
			System.err.println("No fighter profiles found! Please create one.\n");
		}
		return fighter;
	}

}

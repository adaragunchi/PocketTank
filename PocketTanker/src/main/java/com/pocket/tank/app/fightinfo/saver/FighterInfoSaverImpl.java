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

	@Override
	public void saveFighter(Fighter fighter) {
		File f = null;
		f = new File("C:\\Temp\\fighter.txt");
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(fighter);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void saveFighterInfo(FightInfo fightInfo) {
		File f = null;
		f = new File("C:\\Temp\\fighterInfo.txt");
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(fightInfo);
			oos.flush();
			oos.close();
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
			oi.close();
			fi.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return fightInfo;
	}

	@Override
	public Fighter getFighter() {
		Fighter fighter = null;
		try {
			FileInputStream fi = new FileInputStream(new File("C:\\Temp\\fighter.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			fighter = (Fighter) oi.readObject();
			System.out.println("Fighter Profile::"+fighter.toString());
			oi.close();
			fi.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return fighter;
	}

}

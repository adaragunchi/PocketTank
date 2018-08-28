package com.pocket.tank.app.fightinfo.saver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 * This layer is responsible for data saving and retrieving operations in file.
 * FightInfo and Fighters are saved and fetched using methods implemented here.
 *
 */
public class FighterInfoSaverImpl implements FightInfoSaver {
	
	@Override
	public void saveFighter(Fighter fighter) {
		ObjectOutputStream oos;
		String filePath = getFilePath();
		try(FileOutputStream outStream = new FileOutputStream(new File(filePath + "fighter.txt"))) {
			oos = new ObjectOutputStream(outStream);
			oos.writeObject(fighter);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void saveFighterInfo(FightInfo fightInfo) {
		ObjectOutputStream oos;
		String filePath = getFilePath();
		try(FileOutputStream outStream = new FileOutputStream(new File(filePath + "fighterInfo.txt"))) {
			oos = new ObjectOutputStream(outStream);
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
		String filePath = getFilePath();
		try (FileInputStream inpurStream = new FileInputStream(new File(filePath + "fighterInfo.txt"))){
			ObjectInputStream oi = new ObjectInputStream(inpurStream);
			fightInfo = (FightInfo) oi.readObject();
			System.out.println("Fighter Profile::"+fightInfo.toString());
			oi.close();
		} catch (Exception e) {
			System.err.println("No fights found! try playing a fight.\n");
		}
		return fightInfo;
	}

	@Override
	public Fighter getFighter() {
		Fighter fighter = null;
		String filePath = getFilePath();
		try (FileInputStream inputStream = new FileInputStream(new File(filePath + "fighter.txt"))){
			ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
			fighter = (Fighter) objInputStream.readObject();
			System.out.println("Fighter Profile::"+fighter.toString());
			objInputStream.close();
		} catch (Exception e) {
			System.err.println("No fighter profiles found! Please create one.\n");
		}
		return fighter;
	}
	
	/**
	 * This method is responsible to fetch user defined file source path from application properties file.
	 * 
	 * @return
	 */
	private String getFilePath() {
		Properties props = new Properties();
		try {
			props.load(getClass().getClassLoader().getResourceAsStream("pocket-tank.properties"));
			return props.getProperty("file-location");
		} catch (FileNotFoundException e1) {
			System.out.println("unable to load the property file");
		} catch (IOException e1) {
			System.out.println("unable to load the property file");
		}
		return null;

	}

}

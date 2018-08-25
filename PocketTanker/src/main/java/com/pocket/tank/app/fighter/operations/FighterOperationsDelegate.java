/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import com.pocket.tank.app.enums.OpponentCountryName;
import com.pocket.tank.app.enums.OpponentFighterName;
import com.pocket.tank.app.enums.WeaponsMenuItems;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 */
public class FighterOperationsDelegate {

	public Map<String, Integer> getWeaponPower(String weaponEntry) {
		Map<String,Integer> weaponPowerMap = new HashMap<>();
		
		switch (Integer.parseInt(weaponEntry)) {
		case 1:
			weaponPowerMap.put(
			WeaponsMenuItems.KNIFE.getWeapon(),
			WeaponsMenuItems.KNIFE.getWeaponPower());
			break;
		case 2:
			weaponPowerMap.put(
			WeaponsMenuItems.GUN.getWeapon(),
			WeaponsMenuItems.GUN.getWeaponPower());
			break;
		case 3:
			weaponPowerMap.put(
			WeaponsMenuItems.TANK.getWeapon(),
			WeaponsMenuItems.TANK.getWeaponPower());
			break;
		case 4:
			weaponPowerMap.put(
			WeaponsMenuItems.BOMB.getWeapon(),
			WeaponsMenuItems.BOMB.getWeaponPower());
			break;
		case 5  :
			weaponPowerMap.put(
			WeaponsMenuItems.SNIPER.getWeapon(),
			WeaponsMenuItems.SNIPER.getWeaponPower());
			break;
		default:
			break;
		}
		return weaponPowerMap;
	}

	public Fighter createOpponentFighter() {
		Fighter fighter=new Fighter();
		List<String> opponentNames=new ArrayList<>();
		for(OpponentFighterName opponentFighterName:OpponentFighterName.values()) {
			opponentNames.add(opponentFighterName.getOpponentName());
		}
		int n=get(0,opponentNames.size());
		fighter.setFighterName(opponentNames.get(n));
		fighter.setAge(get(20, 50));
		
		List<String> weaponForOpponent=new ArrayList<>();
		for (WeaponsMenuItems opponentWeapon : WeaponsMenuItems.values()) {
			weaponForOpponent.add(opponentWeapon.getWeapon());
		}
		int weapon=get(0, weaponForOpponent.size());
		fighter.setSelectedWeaponPower(getWeaponPower(String.valueOf(weapon)));
		List<String> opponentCountryNames=new ArrayList<>();
		for (OpponentCountryName opponentCountryName : OpponentCountryName.values()) {
			opponentCountryNames.add(opponentCountryName.getCountryName());
		}
		int opponentCountryIndex=get(0, opponentCountryNames.size());
		fighter.setCountry(opponentCountryNames.get(opponentCountryIndex));
		return fighter;
	}
	
	public int get(final int min, final int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

}

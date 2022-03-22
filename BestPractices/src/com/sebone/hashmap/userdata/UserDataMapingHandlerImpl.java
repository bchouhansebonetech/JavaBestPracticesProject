package com.sebone.hashmap.userdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDataMapingHandlerImpl implements UserDataMapingHandler{
	
	public HashMap<Integer, UserDataMaping> getUserDataMap() {
		HardcodedUserDataMaping hardcodedUserData = new HardcodedUserDataMaping();
		
		HashMap<Integer, UserDataMaping> userDataMap = hardcodedUserData.getUserDataMapAsRollAndObject();
		
		return userDataMap;
	}
	
	public UserDataMaping getUserDataByRollNumber(int userRollNumber) {
		HardcodedUserDataMaping hardcodedUserData = new HardcodedUserDataMaping();
		
		HashMap<Integer, UserDataMaping> userDataMap = hardcodedUserData.getUserDataMapAsRollAndObject();
		
		UserDataMaping userDataMaping = userDataMap.get(userRollNumber);
		
		return userDataMaping;
	}
	
	public HashMap<String, ArrayList<UserDataMaping>> findUserDataMapByName() {
		HardcodedUserDataMaping hardcodedUserData = new HardcodedUserDataMaping();
		
		ArrayList<UserDataMaping> userDataList =	hardcodedUserData.getUserDataList();
		
		HashMap<String, ArrayList<UserDataMaping>> userDataMap = new HashMap<String, ArrayList<UserDataMaping>>();
		
		for(UserDataMaping userData : userDataList){
			if(userDataMap.containsKey(userData.getUserName())) {
				userDataMap.get(userData.getUserName()).add(userData);
			}
			else {
				ArrayList<UserDataMaping> currentUserData = new ArrayList<UserDataMaping>();
				currentUserData.add(userData);
				userDataMap.put(userData.getUserName(), currentUserData);
			}
		}
		
		return userDataMap;
	}
	
	
	public ArrayList<UserDataMaping> findUserDataListByName(String name) {
		HardcodedUserDataMaping hardcodedUserData = new HardcodedUserDataMaping();
		
		ArrayList<UserDataMaping> userDataList =	hardcodedUserData.getUserDataList();
		
		HashMap<String, ArrayList<UserDataMaping>> userDataMap = new HashMap<String, ArrayList<UserDataMaping>>();
		
		for(UserDataMaping userData : userDataList){
			if(userDataMap.containsKey(userData.getUserName())) {
				userDataMap.get(userData.getUserName()).add(userData);
			}
			else {
				ArrayList<UserDataMaping> currentUserData = new ArrayList<UserDataMaping>();
				currentUserData.add(userData);
				userDataMap.put(userData.getUserName(), currentUserData);
			}
		}
		
		return userDataMap.get(name);
	}
	
	public HashMap<String, ArrayList<UserDataMaping>> updateUserAgeByName(String name, int age) {
		HardcodedUserDataMaping hardcodedUserData = new HardcodedUserDataMaping();
		
		ArrayList<UserDataMaping> userDataList =	hardcodedUserData.getUserDataList();
		
		HashMap<String, ArrayList<UserDataMaping>> userDataMap = new HashMap<String, ArrayList<UserDataMaping>>();
		
		for(UserDataMaping userData : userDataList){
			if(userDataMap.containsKey(userData.getUserName())) {
				userDataMap.get(userData.getUserName()).add(userData);
			}
			else {
				ArrayList<UserDataMaping> currentUserData = new ArrayList<UserDataMaping>();
				currentUserData.add(userData);
				userDataMap.put(userData.getUserName(), currentUserData);
			}
		}
		
		ArrayList<UserDataMaping> usersWithSameName = userDataMap.get(name);
		
		for(UserDataMaping userWithSameName: usersWithSameName) {
			userWithSameName.setUserAge(age);
		}
		
		
		return userDataMap;
	}

}

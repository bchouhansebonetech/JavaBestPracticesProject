package com.sebone.hashmap.userdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class UserDataMapingDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UserDataMaping userDataMaping = new UserDataMaping();
//		
//		HashMap<Integer, String> userDataMap1 = userData.getUserNameByRollNumber();
//		
//		System.out.println(userDataMap1.get(103));
//		System.out.println(userDataMap1.get(101));
		
		
		
		
		UserDataMapingHandlerImpl userDataMapingHandlerImpl = new UserDataMapingHandlerImpl();
//		HashMap<Integer, UserDataMaping>  userDataMap2 = userDataMapingHandlerImpl.getUserDataMap();
//		
//		Set<Integer> keys = userDataMap2.keySet();
//		
//		for(Integer key : keys) {
//			UserDataMaping userDataMaping = userDataMap2.get(key);
//			
//			System.out.print("User Roll Number: " + userDataMaping.getUserRollNumber());
//			System.out.print(", User Name: " + userDataMaping.getUserName());
//			System.out.print(", User Age: " + userDataMaping.getUserAge());
//			System.out.println();
//		}

		
		
//		UserDataMaping userDataMaping = userDataMapingHandlerImpl.getUserDataByRollNumber(103);
//		
//		System.out.print("\nUser Roll Number: " + userDataMaping.getUserRollNumber());
//		System.out.print(", User Name: " + userDataMaping.getUserName());
//		System.out.print(", User Age: " + userDataMaping.getUserAge());
//		System.out.println();
		
		
//		ArrayList<UserDataMaping> userDataList = userDataMapingHandlerImpl.findUserDataListByName("Bhanu");
//		
//		for(UserDataMaping userDataMaping: userDataList) {
//			
//			System.out.print("User Roll Number: " + userDataMaping.getUserRollNumber());
//			System.out.print(", User Name: " + userDataMaping.getUserName());
//			System.out.print(", User Age: " + userDataMaping.getUserAge());
//			System.out.println();
//		}
		
		
//		HashMap<String, ArrayList<UserDataMaping>> userDataMap3 = userDataMapingHandlerImpl.updateUserAgeByName("Rahul", 78);
//		
//		Set<String> keys = userDataMap3.keySet();
//		
//		for(String key: keys) {
//			for(UserDataMaping userDataMaping : userDataMap3.get(key)) {
//				
//				System.out.print("User Roll Number: " + userDataMaping.getUserRollNumber());
//				System.out.print(", User Name: " + userDataMaping.getUserName());
//				System.out.print(", User Age: " + userDataMaping.getUserAge());
//				System.out.println();
//			}
//		}
		
		HashMap<String, ArrayList<UserDataMaping>> userDataMap3 = userDataMapingHandlerImpl.findUserDataMapByName();
		
		Set<String> keys = userDataMap3.keySet();
		
		for(String key: keys) {
			for(UserDataMaping userDataMaping : userDataMap3.get(key)) {
				
				System.out.print("User Roll Number: " + userDataMaping.getUserRollNumber());
				System.out.print(", User Name: " + userDataMaping.getUserName());
				System.out.print(", User Age: " + userDataMaping.getUserAge());
				System.out.println();
			}
		}
		
	}

}

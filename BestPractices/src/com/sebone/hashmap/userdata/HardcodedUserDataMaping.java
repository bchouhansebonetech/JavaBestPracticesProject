package com.sebone.hashmap.userdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sebone.userinfo.userdatasort.UserData;

public class HardcodedUserDataMaping {
	
	public ArrayList<UserDataMaping> getUserDataList()
	{
		//user1 is created
		UserDataMaping user1 = new UserDataMaping();
		//user1 data insertion
		user1.setUserRollNumber(105);
		user1.setUserAge(23);
		user1.setUserName("Bhanu");
		
		//user2 is created
		UserDataMaping user2 = new UserDataMaping();
		//user1 data insertion
		user2.setUserRollNumber(103);
		user2.setUserAge(22);
		user2.setUserName("Shraddha");
		
		//user3 is created
		UserDataMaping user3 = new UserDataMaping();
		//user3 data insertion
		user3.setUserRollNumber(101);
		user3.setUserAge(21);
		user3.setUserName("Rahul");
		
		//user4 is created
		UserDataMaping user4 = new UserDataMaping();
		//user4 data insertion
		user4.setUserRollNumber(104);
		user4.setUserAge(25);
		user4.setUserName("Shreya");
		
		//user5 is created
		UserDataMaping user5 = new UserDataMaping();
		//user5 data insertion
		user5.setUserRollNumber(102);
		user5.setUserAge(16);
		user5.setUserName("Karan");
		
		//user6 is created
		UserDataMaping user6 = new UserDataMaping();
		//user6 data insertion
		user6.setUserRollNumber(106);
		user6.setUserAge(22);
		user6.setUserName("Radha");
		
		//user7 is created
		UserDataMaping user7 = new UserDataMaping();
		//user7 data insertion
		user7.setUserRollNumber(109);
		user7.setUserAge(23);
		user7.setUserName("Rahul");
		
		
		//user8 is created
		UserDataMaping user8 = new UserDataMaping();
		//user8 data insertion
		user8.setUserRollNumber(108);
		user8.setUserAge(16);
		user8.setUserName("Bhanu");
		
		//user9 is created
		UserDataMaping user9 = new UserDataMaping();
		//user9 data insertion
		user9.setUserRollNumber(110);
		user9.setUserAge(35);
		user9.setUserName("Bhanu");
		
		//user10 is created
		UserDataMaping user10 = new UserDataMaping();
		//user10 data insertion
		user10.setUserRollNumber(107);
		user10.setUserAge(25);
		user10.setUserName("Ritu");
		
		ArrayList<UserDataMaping> userDataList = new  ArrayList<UserDataMaping>();
		 
		userDataList.add(user1);
		userDataList.add(user2);
		userDataList.add(user3);
		userDataList.add(user4);
		userDataList.add(user5);
		userDataList.add(user6);
		userDataList.add(user7);
		userDataList.add(user8);
		userDataList.add(user9);
		userDataList.add(user10);
		
		return userDataList;
	}
	
	public HashMap<Integer, UserDataMaping> getUserDataMapAsRollAndObject() {
		HashMap<Integer, UserDataMaping> userDataMap = new HashMap<Integer, UserDataMaping>();
		ArrayList<UserDataMaping> userDataList = getUserDataList();
		
		for(int iterator = 0; iterator < userDataList.size(); iterator++) {
			userDataMap.put(userDataList.get(iterator).getUserRollNumber(), userDataList.get(iterator));
		}
		
		return userDataMap;
	}
}

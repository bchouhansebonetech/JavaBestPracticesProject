package com.sebone.userinfo.userdatasort;

import java.util.ArrayList;
import java.util.Collection;

public class UserDataDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user1 is created
		UserData user1 = new UserData();
		//user1 data insertion
		user1.setUserRollNumber(105);
		user1.setUserAge(23);
		user1.setUserName("Bhanu");
		
		//user2 is created
		UserData user2 = new UserData();
		//user1 data insertion
		user2.setUserRollNumber(103);
		user2.setUserAge(22);
		user2.setUserName("Shraddha");
		
		//user3 is created
		UserData user3 = new UserData();
		//user3 data insertion
		user3.setUserRollNumber(101);
		user3.setUserAge(21);
		user3.setUserName("Ayush");
		
		//user4 is created
		UserData user4 = new UserData();
		//user4 data insertion
		user4.setUserRollNumber(104);
		user4.setUserAge(25);
		user4.setUserName("Shreya");
		
		//user5 is created
		UserData user5 = new UserData();
		//user5 data insertion
		user5.setUserRollNumber(102);
		user5.setUserAge(16);
		user5.setUserName("Rahul");
		
		 ArrayList<UserData> userDataList = new  ArrayList<UserData>();
		 ArrayList<UserData> sortedUserDataList = new  ArrayList<UserData>();
		 
		 userDataList.add(user1);
		 userDataList.add(user2);
		 userDataList.add(user3);
		 userDataList.add(user4);
		 userDataList.add(user5);
		 
		 SortUserDataImpl sortingUserData = new SortUserDataImpl();
		 
//		 sortedUserDataList = sortingUserData.sortUserDataByRollNumber(userDataList);
		 
//		 sortedUserDataList = sortingUserData.sortUserDataByAge(userDataList);
		 
		 sortedUserDataList = sortingUserData.sortUserDataByName(userDataList);
		 
		 
		 for(int iterator = 0; iterator < sortedUserDataList.size(); iterator++)
		 {
			 System.out.print(sortedUserDataList.get(iterator).getUserAge());
			 System.out.print(" " + sortedUserDataList.get(iterator).getUserRollNumber());
			 System.out.print(" " + sortedUserDataList.get(iterator).getUserName() + "\n");
//			 System.out.println();
		 }
		 
	}

}

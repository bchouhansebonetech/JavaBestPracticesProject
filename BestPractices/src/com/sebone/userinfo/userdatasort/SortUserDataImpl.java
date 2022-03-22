package com.sebone.userinfo.userdatasort;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class SortUserDataImpl implements SortUserData{
	public ArrayList<UserData> sortUserData(ArrayList<UserData> userDataList) {
		
		
//      Sorting Using UserAge
		for(int iterator1 = 0; iterator1 < userDataList.size(); iterator1++) {
			for(int iterator2 = 1; iterator2 < userDataList.size() - iterator1; iterator2++) {
				if(userDataList.get(iterator2).getUserAge() < userDataList.get(iterator2 - 1).getUserAge()) {
					
					UserData user1 = userDataList.get(iterator2);
					UserData user2 = userDataList.get(iterator2 - 1);
					
					userDataList.set(iterator2 - 1, user1);
					userDataList.set(iterator2, user2);
				}
			}
		}
	
//      Sorting Using UserRollNumber
//		for(int iterator1 = 0; iterator1 < userDataList.size(); iterator1++) {
//			for(int iterator2 = 1; iterator2 < userDataList.size() - iterator1; iterator2++) {
//				if(userDataList.get(iterator2).getUserRollNumber() < userDataList.get(iterator2 - 1).getUserRollNumber()) {
//					
//					UserData user1 = userDataList.get(iterator2);
//					UserData user2 = userDataList.get(iterator2 - 1);
//					
//					userDataList.set(iterator2 - 1, user1);
//					userDataList.set(iterator2, user2);
//				}
//			}
//		}
		
//      Sorting Using UserName
//		for(int iterator1 = 0; iterator1 < userDataList.size(); iterator1++) {
//			for(int iterator2 = 1; iterator2 < userDataList.size() - iterator1; iterator2++) {
//				if(userDataList.get(iterator2).getUserName().compareTo(userDataList.get(iterator2 - 1).getUserName()) < 0) {
//					
//					UserData user1 = userDataList.get(iterator2);
//					UserData user2 = userDataList.get(iterator2 - 1);
//					
//					userDataList.set(iterator2 - 1, user1);
//					userDataList.set(iterator2, user2);
//				}
//			}
//		}
		
		return userDataList;
	}
	
	public ArrayList<UserData> sortUserDataByRollNumber(ArrayList<UserData> userDataList) {
		Collections.sort(userDataList, new SortByRollNumber());
		
		return userDataList;
	}
	
	public ArrayList<UserData> sortUserDataByAge(ArrayList<UserData> userDataList) {
		Collections.sort(userDataList, new SortByAge());
		
		return userDataList;
	}
	
	public ArrayList<UserData> sortUserDataByName(ArrayList<UserData> userDataList){
		Collections.sort(userDataList, new SortByName());
		
		return userDataList;
	}
	
}

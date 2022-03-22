package com.sebone.userinfo.userdatasort;

import java.util.Comparator;

public class SortByRollNumber implements Comparator <UserData>{
	public int compare(UserData user1, UserData user2) {
//		if(user1.getUserRollNumber() == user2.getUserRollNumber())
//			return 0;
//		else if(user1.getUserRollNumber() < user2.getUserRollNumber())
//			return -1;
//		else 
//			return 1;
		
		
		return user1.getUserRollNumber() - user2.getUserRollNumber();
	}
}

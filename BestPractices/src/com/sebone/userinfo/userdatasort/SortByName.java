package com.sebone.userinfo.userdatasort;

import java.util.Comparator;

public class SortByName implements Comparator <UserData>{
	public int compare (UserData user1, UserData user2) {
		return user1.getUserName().compareTo(user2.getUserName());
	}
}

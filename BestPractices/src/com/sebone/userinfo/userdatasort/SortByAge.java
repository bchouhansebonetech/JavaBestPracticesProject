package com.sebone.userinfo.userdatasort;

import java.util.Comparator;

public class SortByAge implements Comparator <UserData>{
	public int compare(UserData user1, UserData user2) {
		return user1.getUserAge() - user2.getUserAge();
	}
}

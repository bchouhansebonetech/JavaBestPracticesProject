package com.sebone.hashmap.userdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface UserDataMapingHandler {
	
	HashMap<Integer, UserDataMaping> getUserDataMap();
	
	UserDataMaping getUserDataByRollNumber(int userRollNumber);
	
	HashMap<String, ArrayList<UserDataMaping>> findUserDataMapByName();
	
	ArrayList<UserDataMaping> findUserDataListByName(String name);
	
	HashMap<String, ArrayList<UserDataMaping>> updateUserAgeByName(String name, int age);	
}

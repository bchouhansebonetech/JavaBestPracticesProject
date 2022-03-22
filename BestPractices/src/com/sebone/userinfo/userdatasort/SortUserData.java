package com.sebone.userinfo.userdatasort;

import java.util.ArrayList;

public interface SortUserData {
	public ArrayList<UserData> sortUserData(ArrayList<UserData> userDataList);
	public ArrayList<UserData> sortUserDataByAge(ArrayList<UserData> userDataList);
	public ArrayList<UserData> sortUserDataByRollNumber(ArrayList<UserData> userDataList);
	public ArrayList<UserData> sortUserDataByName(ArrayList<UserData> userDataList);
}

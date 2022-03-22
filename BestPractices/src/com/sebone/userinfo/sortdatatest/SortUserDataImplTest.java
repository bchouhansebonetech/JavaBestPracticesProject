/**
 * 
 */
package com.sebone.userinfo.sortdatatest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.userinfo.userdatasort.SortUserDataImpl;
import com.sebone.userinfo.userdatasort.UserData;

/**
 * @author Bhanu Singh
 *
 */
public class SortUserDataImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sebone.userinfo.userdatasort.SortUserDataImpl#sortUserData(java.util.ArrayList)}.
	 */
	@Test
	public void testSortUserData() {
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
		 ArrayList<UserData> userDataListResult = new  ArrayList<UserData>();
		 
		 userDataList.add(user1);
		 userDataList.add(user2);
		 userDataList.add(user3);
		 userDataList.add(user4);
		 userDataList.add(user5);
		 
		 userDataListResult.add(user5);
		 userDataListResult.add(user3);
		 userDataListResult.add(user2);
		 userDataListResult.add(user1);
		 userDataListResult.add(user4);
		 
		 SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		 
		 assertEquals(userDataListResult, sortUserDataImpl.sortUserData(userDataList));
	}

	/**
	 * Test method for {@link com.sebone.userinfo.userdatasort.SortUserDataImpl#sortUserDataByRollNumber(java.util.ArrayList)}.
	 */
	@Test
	public void testSortUserDataByRollNumber() {
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
		 ArrayList<UserData> userDataListResult = new  ArrayList<UserData>();
		 
		 userDataList.add(user1);
		 userDataList.add(user2);
		 userDataList.add(user3);
		 userDataList.add(user4);
		 userDataList.add(user5);
		 
		 userDataListResult.add(user3);
		 userDataListResult.add(user5);
		 userDataListResult.add(user2);
		 userDataListResult.add(user4);
		 userDataListResult.add(user1);
		 
		 SortUserDataImpl sortUserDataImpl = new SortUserDataImpl();
		 
		 assertEquals(userDataListResult, sortUserDataImpl.sortUserDataByRollNumber(userDataList));
	}
//
//	/**
//	 * Test method for {@link com.sebone.userinfo.userdatasort.SortUserDataImpl#sortUserDataByAge(java.util.ArrayList)}.
//	 */
//	@Test
//	public void testSortUserDataByAge() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.sebone.userinfo.userdatasort.SortUserDataImpl#sortUserDataByName(java.util.ArrayList)}.
//	 */
//	@Test
//	public void testSortUserDataByName() {
//		fail("Not yet implemented");
//	}

}

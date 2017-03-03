package com.bakInfo.dao;

import java.util.List;

import com.bakInfo.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}

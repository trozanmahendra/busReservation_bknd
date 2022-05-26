package com.mgWork.service;

import java.util.List;

import com.mgWork.entity.Admin;

public interface AdminService {
	public Admin saveAdmin(Admin admin);

	public List<Admin> fetchAdminList();
}

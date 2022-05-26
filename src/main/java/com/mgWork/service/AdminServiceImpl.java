package com.mgWork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgWork.entity.Admin;
import com.mgWork.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> fetchAdminList() {
		
		return adminRepository.findAll();
	}
	

	
	
}

package com.mgWork.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWork.entity.Admin;
import com.mgWork.service.AdminService;

@RestController
public class AdminController {

	private final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private AdminService adminService;

	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		LOGGER.info("saveAdmin method Invoked");
		return adminService.saveAdmin(admin);
	}
	@GetMapping("/adminlist")
	public List<Admin> fetchAdminList() {
		return adminService.fetchAdminList();
		
	}
}

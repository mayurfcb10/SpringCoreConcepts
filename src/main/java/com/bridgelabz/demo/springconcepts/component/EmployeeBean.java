package com.bridgelabz.demo.springconcepts.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	private int eid;
	private String ename;

	@Autowired
	private DepartmentBean deptBean;
	private static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

	/*
	 * This constructor is used for @Autowired on constructor
	 * @param deptBean
	 */
	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		logger.trace("Autowired by using @Autowire annotation on constructor");
		this.deptBean = deptBean;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public DepartmentBean getDeptBean() {
		return deptBean;
	}

	/*
	 * This setter method is used for @Autowired on setter
	 * @param deptBean
	 */
	public void setDeptBean(DepartmentBean deptBean) {
		logger.trace("Autowiring by using @Autowire annotation on Setter method");
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee ID : {}",eid);
		logger.debug("Employee Name : {}", ename);
		deptBean.setDeptName("Electrical Engineering");
		logger.debug("Department : {}",deptBean.getDeptName());
	}
}

package com.raj.interfaces;

import java.util.List;

import com.raj.bean.Farmer;

public interface farmer_interface {
	boolean insert(Farmer farmer);
	boolean delete(String user,String password);
	List<Farmer> view();
	boolean valid(String user,String password);
}

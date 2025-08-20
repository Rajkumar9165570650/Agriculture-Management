package com.raj.interfaces;

import java.util.List;

import com.raj.bean.Crop;

public interface Crop_Interfaces {
	boolean insert(Crop crop);
	boolean delete(int id);
	List<Crop> view();
}

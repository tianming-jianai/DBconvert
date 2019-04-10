package com.vae.dao;

import java.sql.SQLException;
import java.util.List;

import com.vae.bean.Schema;

public interface SchemaDao {

	// 查找所有
	public List<Schema> findAll() throws SQLException;

	
}

package com.vae.dao;

import java.sql.SQLException;
import java.util.List;

import com.vae.bean.Column;

public interface ColumnDao {

	// 查找所有
	public List<Column> findAll(String table) throws SQLException;
}

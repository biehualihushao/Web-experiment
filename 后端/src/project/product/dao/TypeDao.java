package project.product.dao;

import java.util.List;

import project.product.entity.Type;

public interface TypeDao {
	Type selectById(int id);
	List<Type> selectAll();
}

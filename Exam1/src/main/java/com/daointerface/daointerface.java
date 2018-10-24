package com.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface daointerface extends CrudRepository<Login, Integer>
{
	public Login findAllByUnameAndPass(String uname, String pass);
}

package com.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daointerface.daointerface;
import com.model.Login;
import com.serviceinterface.serviceinterface;
@Service
public class serviceimple implements serviceinterface {

	@Autowired
	daointerface dao;
	@Override
	public Login savedata(Login l) {
		
		return dao.save(l);
	}
	@Override
	public List<Login> login(Login l) 
	{
		System.out.println("login imple");
		Login l1=dao.findAllByUnameAndPass(l.getUname(), l.getPass());
		if(l1!=null)
		{
		return (List<Login>) dao.findAll();
		}
		else
		{
			return null;
		}
	}
	@Override
	public List<Login> delete(int lid) 
	{
		dao.delete(lid);
		return (List<Login>) dao.findAll();
	}
	@Override
	public Login edit(int lid)
	{
		
		return dao.findOne(lid);
	}
	@Override
	public List<Login> update(Login l) {
		Login l1=dao.save(l);
		return (List<Login>)dao.findAll(); 
	}

}

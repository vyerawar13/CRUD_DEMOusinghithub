package com.serviceinterface;

import java.util.List;

import com.model.Login;

public interface serviceinterface
{
public Login savedata(Login l);
public List<Login> login(Login l);
public List<Login> delete(int lid);
public Login edit(int lid);
public List<Login> update(Login l);
}

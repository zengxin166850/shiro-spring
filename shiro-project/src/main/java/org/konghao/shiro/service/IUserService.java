package org.konghao.shiro.service;

import java.util.List;

import org.konghao.shiro.model.Resource;
import org.konghao.shiro.model.Role;
import org.konghao.shiro.model.User;

public interface IUserService {
	public User add(User user);
	
	public User add(User user,List<Integer> rids);
	
	public void delete(int id);
	
	public User update(User user,List<Integer> rids);
	
	public User update(User user);
	
	public User load(int id);
	
	public User loadByUsername(String username);
	
	public User login(String username,String password);
	
	public List<User> list();
	
	public List<User> listByRole(int id);
	
	public List<Resource> listAllResource(int uid);
	
	public List<String> listRoleSnByUser(int uid);
	
	public List<Role> listUserRole(int uid);
}

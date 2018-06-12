package org.konghao.shiro.dao;

import java.util.List;

import org.konghao.basic.dao.IBaseDao;
import org.konghao.shiro.model.Resource;
import org.konghao.shiro.model.Role;
import org.konghao.shiro.model.User;

public interface IUserDao extends IBaseDao<User> {
	public List<User> listUser();
	
	public User loadByUsername(String username);
	
	public List<User> listByRole(int id);
	
	public List<Resource> listAllResource(int uid);
	
	public List<String> listRoleSnByUser(int uid);
	
	public List<Role> listUserRole(int uid);
	
}

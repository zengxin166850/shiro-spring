package org.konghao.shiro.dao;

import java.util.List;

import org.konghao.basic.dao.IBaseDao;
import org.konghao.shiro.model.Resource;

public interface IResourceDao extends IBaseDao<Resource>{
	public List<Resource> listResource();
}

package org.konghao.shiro.dao;

import java.util.List;

import org.konghao.basic.dao.BaseDao;
import org.konghao.shiro.model.Resource;
import org.springframework.stereotype.Repository;

@Repository("resourceDao")
public class ResourceDao extends BaseDao<Resource> implements IResourceDao {

	public List<Resource> listResource() {
		return super.list("from Resource");
	}
	
}

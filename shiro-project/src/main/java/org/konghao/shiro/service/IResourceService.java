package org.konghao.shiro.service;

import java.util.List;

import org.konghao.shiro.model.Resource;

public interface IResourceService {
	public void add(Resource res);
	
	public void update(Resource res);
	
	public void delete(int id);
	
	public Resource load(int id);
	
	public List<Resource> listResource();
}

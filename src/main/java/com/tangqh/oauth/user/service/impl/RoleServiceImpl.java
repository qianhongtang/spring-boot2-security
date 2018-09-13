/**
 * 
 */
package com.tangqh.oauth.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangqh.oauth.common.repository.BaseRepository;
import com.tangqh.oauth.common.service.AbstractService;
import com.tangqh.oauth.user.entity.Role;
import com.tangqh.oauth.user.repository.RoleRepository;
import com.tangqh.oauth.user.service.RoleService;

/**
 * 
 * @author qianhongtang
 *
 */
@Service
public class RoleServiceImpl extends AbstractService<Role, Long, BaseRepository<Role, Long>> implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	@Cacheable(value = "redisCache", key = "'find-role-by-userid-' + #userId")
	public List<Role> findByUserId(Long userId) {
		return roleRepository.findByUserId(userId);
	}

}

package com.tangqh.oauth.user.service;

import java.util.List;

import com.tangqh.oauth.common.service.Service;
import com.tangqh.oauth.user.entity.Role;

/**
 * 
 * 
 * @author qianhongtang
 *
 */
public interface RoleService extends Service<Role, Long> {

	List<Role> findByUserId(Long userId);

}

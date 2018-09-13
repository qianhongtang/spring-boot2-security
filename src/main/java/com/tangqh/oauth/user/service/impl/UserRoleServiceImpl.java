/**
 * 
 */
package com.tangqh.oauth.user.service.impl;

import org.springframework.stereotype.Service;

import com.tangqh.oauth.common.repository.BaseRepository;
import com.tangqh.oauth.common.service.AbstractService;
import com.tangqh.oauth.user.entity.UserRole;
import com.tangqh.oauth.user.service.UserRoleService;

/**
 * 
 * @author qianhongtang
 *
 */
@Service
public class UserRoleServiceImpl extends AbstractService<UserRole, Long, BaseRepository<UserRole, Long>>
		implements UserRoleService {

}

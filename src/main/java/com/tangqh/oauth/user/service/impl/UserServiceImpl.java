/**
 * 
 */
package com.tangqh.oauth.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tangqh.oauth.common.repository.BaseRepository;
import com.tangqh.oauth.common.service.AbstractService;
import com.tangqh.oauth.user.entity.User;
import com.tangqh.oauth.user.repository.UserRepository;
import com.tangqh.oauth.user.service.UserService;

/**
 * 
 * @author qianhongtang
 *
 */
@Service
public class UserServiceImpl extends AbstractService<User, Long, BaseRepository<User, Long>> implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Cacheable(value = "redisCache", key = "'find-user-by-username-' + #username")
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}

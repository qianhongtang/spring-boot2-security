/**
 * 
 */
package com.tangqh.oauth.user.service;

import com.tangqh.oauth.common.service.Service;
import com.tangqh.oauth.user.entity.User;

/**
 * 
 * @author qianhongtang
 *
 */
public interface UserService extends Service<User, Long> {
	User findByUsername(String username);
}
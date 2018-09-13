package com.tangqh.oauth.user.repository;

import com.tangqh.oauth.common.repository.BaseRepository;
import com.tangqh.oauth.user.entity.User;

public interface UserRepository extends BaseRepository<User, Long> {

	User findByUsername(String username);
}

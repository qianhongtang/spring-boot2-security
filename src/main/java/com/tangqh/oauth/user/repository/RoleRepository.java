package com.tangqh.oauth.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.tangqh.oauth.common.repository.BaseRepository;
import com.tangqh.oauth.user.entity.Role;

public interface RoleRepository extends BaseRepository<Role, Long> {

	@Query(value = "select * from oauth_role ar left join oauth_user_role aur on ar.id=aur.role_id where aur.user_id=?1", nativeQuery = true)
	List<Role> findByUserId(Long userId);
}

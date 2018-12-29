package cn.ulegal.ssm.dao;

import cn.ulegal.ssm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
	
	List<User> findAll();
}

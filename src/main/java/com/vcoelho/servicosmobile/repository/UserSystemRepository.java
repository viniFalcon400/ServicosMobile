package com.vcoelho.servicosmobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vcoelho.servicosmobile.entity.UserSystem;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vinicius
 */
@Repository
public interface UserSystemRepository extends JpaRepository<UserSystem, Long> {

	UserSystem findByEmail(String email);

}

package com.demo.domain.p;

import com.demo.domain.p.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Downey.hz on 2016/9/23..
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}

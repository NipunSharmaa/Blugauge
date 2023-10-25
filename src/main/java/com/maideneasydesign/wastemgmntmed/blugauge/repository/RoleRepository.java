package com.maideneasydesign.wastemgmntmed.blugauge.repository;

import com.maideneasydesign.wastemgmntmed.blugauge.model.Role;
import com.maideneasydesign.wastemgmntmed.blugauge.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName (RoleName rolename);
}

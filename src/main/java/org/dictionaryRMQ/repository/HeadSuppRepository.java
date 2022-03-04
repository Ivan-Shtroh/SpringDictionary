package org.dictionaryRMQ.repository;

import org.dictionaryRMQ.entity.Head_supp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface HeadSuppRepository extends JpaRepository<Head_supp, UUID>, JpaSpecificationExecutor<Head_supp> {
}

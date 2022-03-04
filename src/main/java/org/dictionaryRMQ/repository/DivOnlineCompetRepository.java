package org.dictionaryRMQ.repository;

import org.dictionaryRMQ.entity.DivOnlineCompet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface DivOnlineCompetRepository extends JpaRepository<DivOnlineCompet, UUID>, JpaSpecificationExecutor<DivOnlineCompet> {
}

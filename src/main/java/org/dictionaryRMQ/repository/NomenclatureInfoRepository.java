package org.dictionaryRMQ.repository;

import org.dictionaryRMQ.entity.Nomenclature_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface NomenclatureInfoRepository extends JpaRepository<Nomenclature_info, UUID>, JpaSpecificationExecutor<Nomenclature_info> {
}

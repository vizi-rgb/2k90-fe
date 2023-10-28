package com.vizirgb.backend2k90.repositories;

import com.vizirgb.backend2k90.entities.AlbumEntity;
import com.vizirgb.backend2k90.entities.BandMembershipEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BandMembershipRepository extends CrudRepository<BandMembershipEntity, Long> {

    Collection<BandMembershipEntity> findAllByBandId(long bandId);
}

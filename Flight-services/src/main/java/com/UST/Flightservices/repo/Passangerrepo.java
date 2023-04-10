package com.UST.Flightservices.repo;

import com.UST.Flightservices.entity.Passangerinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passangerrepo extends JpaRepository<Passangerinfo,Long> {
}

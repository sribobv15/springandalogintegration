package com.medical.system.springRestAndDataJpaWithSpringBoot.repository;

import com.medical.system.springRestAndDataJpaWithSpringBoot.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface  PatientRepository  extends JpaRepository<Patient,Long>{

}

package com.enoca.challengeProject.dataAccess;

import com.enoca.challengeProject.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}

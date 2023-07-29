package com.enoca.challengeProject.services;

import com.enoca.challengeProject.dataAccess.CompanyRepository;
import com.enoca.challengeProject.entities.Company;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    //GetAll
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    //GetCompany
    public Company getCompany(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    //CreateCompany
    public Company createCompany(Company newCompany) {
        return companyRepository.save(newCompany);
    }

    //DeleteCompany
    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }

    //UpdateCompany
    public Company updateCompany(Long companyId, Company newCompany) {
        Optional<Company> company = companyRepository.findById(companyId);
        if (company.isPresent()) {
            Company companyToUpdate = company.get();
            //companyToUpdate.setCompanyId(newCompany.getCompanyId());
            companyToUpdate.setCompanyName(newCompany.getCompanyName());
            companyRepository.save(companyToUpdate);
            return companyToUpdate;
        }
        return null;

    }


}

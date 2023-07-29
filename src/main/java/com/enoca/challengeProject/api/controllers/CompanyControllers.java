package com.enoca.challengeProject.api.controllers;

import com.enoca.challengeProject.entities.Company;
import com.enoca.challengeProject.services.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyControllers {

    private CompanyService companyService;

    public CompanyControllers (CompanyService companyService){
        this.companyService=companyService;
    }

    //GetAll
    @GetMapping("/getAll")
    public List<Company> getAllCompany(){
        return companyService.getAll();
    }

    //GetCompany
    @GetMapping("/getCompany/{companyId}")
    public Company getCompany(@PathVariable("companyId") Long companyId){
        return companyService.getCompany(companyId);
    }

    //CreateCompany
    @PostMapping("/create")
    public Company createCompany(@RequestBody Company newCompany){
        return companyService.createCompany(newCompany);
    }

    //DeleteCompany
    @DeleteMapping("/delete/{companyId}")
    public void deleteCompany(@PathVariable("companyId") Long companyId){
        companyService.deleteCompany(companyId);
    }

    //UpdateCompany
    @PutMapping("/update/{companyId}")
    public Company updateCompany(@PathVariable("companyId") Long companyId, @RequestBody Company newCompany){
        return companyService.updateCompany(companyId,newCompany);
    }


}

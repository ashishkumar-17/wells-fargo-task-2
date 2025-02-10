package com.wellsfargo.counselor.services;

import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.repositories.AdvisorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvisorService {

    private final AdvisorRepository AdvisorRepository;

    public AdvisorService(AdvisorRepository AdvisorRepository) {
        this.AdvisorRepository = AdvisorRepository;
    }

    public List<Advisor> getAllAdvisors() {
        return AdvisorRepository.findAll();
    }

    public Optional<Advisor> getAdvisorById(Long id) {
        return AdvisorRepository.findById(id);
    }

    public Advisor saveAdvisor(Advisor advisor) {
        return AdvisorRepository.save(advisor);
    }

    public void deleteAdvisor(Long id) {
        AdvisorRepository.deleteById(id);
    }
}

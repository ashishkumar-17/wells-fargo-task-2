package com.wellsfargo.counselor.services;

import com.wellsfargo.counselor.repositories.SecurityRepository;
import com.wellsfargo.counselor.entity.Security;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecurityService {

    private final SecurityRepository securityRepository;

    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<Security> getAllSecurities() {
        return securityRepository.findAll();
    }

    public Optional<Security> getSecurityById(Long id) {
        return securityRepository.findById(id);
    }

    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }

    public void deleteSecurity(Long id) {
        securityRepository.deleteById(id);
    }
}

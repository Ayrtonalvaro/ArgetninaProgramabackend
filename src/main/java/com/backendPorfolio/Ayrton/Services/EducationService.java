package com.backendPorfolio.Ayrton.Services;

import com.backendPorfolio.Ayrton.Entity.Education;
import com.backendPorfolio.Ayrton.Repository.EdacuationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducationService {

    private final EdacuationRepository edacuationRepository;

    @Autowired
    public EducationService(EdacuationRepository edacuationRepository) {
        this.edacuationRepository = edacuationRepository;
    }

    public Education addEducation (Education education) {
        return edacuationRepository.save(education);
    }

    public List<Education> findEducations () {
        return edacuationRepository.findAll();
    }

    public Optional<Education> findById(Long id) {
        return edacuationRepository.findById(id);
    }

    public void save(Education education){
        edacuationRepository.save(education);
    }

    public void deleteEducation (Long id) {
        edacuationRepository.deleteById(id);
    }

}

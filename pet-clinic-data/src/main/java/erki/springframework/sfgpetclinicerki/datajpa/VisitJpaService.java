package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.Visit;
import erki.springframework.sfgpetclinicerki.repositories.VisitRepository;
import erki.springframework.sfgpetclinicerki.services.VisitService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VisitJpaService implements VisitService {

    private final VisitRepository VisitRepository;

    public VisitJpaService(VisitRepository VisitRepository) {
        this.VisitRepository = VisitRepository;
    }


    @Override
    public Set<Visit> findAll() {
        Set<Visit> Visits = new HashSet<>();

        VisitRepository.findAll().forEach(Visits::add);
        return Visits;
    }

    @Override
    public Visit findById(Long id) {
        return VisitRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Visit save(Visit obj) {
        return VisitRepository.save(obj);
    }

    @Override
    public void delete(Visit obj) {
        VisitRepository.delete(obj);
    }
}

package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.Vet;
import erki.springframework.sfgpetclinicerki.repositories.VetRepository;
import erki.springframework.sfgpetclinicerki.services.VetService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetJpaService implements VetService {

    private final VetRepository VetRepository;

    public VetJpaService(VetRepository VetRepository) {
        this.VetRepository = VetRepository;
    }


    @Override
    public Set<Vet> findAll() {
        Set<Vet> Vets = new HashSet<>();

        VetRepository.findAll().forEach(Vets::add);
        return Vets;
    }

    @Override
    public Vet findById(Long id) {
        return VetRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Vet save(Vet obj) {
        return VetRepository.save(obj);
    }

    @Override
    public void delete(Vet obj) {
        VetRepository.delete(obj);
    }
}

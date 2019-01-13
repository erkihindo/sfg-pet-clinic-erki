package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.Pet;
import erki.springframework.sfgpetclinicerki.repositories.PetRepository;
import erki.springframework.sfgpetclinicerki.services.PetService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetJpaService implements PetService {

    private final PetRepository PetRepository;

    public PetJpaService(PetRepository PetRepository) {
        this.PetRepository = PetRepository;
    }


    @Override
    public Set<Pet> findAll() {
        Set<Pet> Pets = new HashSet<>();

        PetRepository.findAll().forEach(Pets::add);
        return Pets;
    }

    @Override
    public Pet findById(Long id) {
        return PetRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Pet save(Pet obj) {
        return PetRepository.save(obj);
    }

    @Override
    public void delete(Pet obj) {
        PetRepository.delete(obj);
    }
}

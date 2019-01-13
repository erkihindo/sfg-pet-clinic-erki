package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.PetType;
import erki.springframework.sfgpetclinicerki.repositories.PetTypeRepository;
import erki.springframework.sfgpetclinicerki.services.PetTypeService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepository PetTypeRepository;

    public PetTypeJpaService(PetTypeRepository PetTypeRepository) {
        this.PetTypeRepository = PetTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        Set<PetType> PetTypes = new HashSet<>();

        PetTypeRepository.findAll().forEach(PetTypes::add);
        return PetTypes;
    }

    @Override
    public PetType findById(Long id) {
        return PetTypeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public PetType save(PetType obj) {
        return PetTypeRepository.save(obj);
    }

    @Override
    public void delete(PetType obj) {
        PetTypeRepository.delete(obj);
    }
}

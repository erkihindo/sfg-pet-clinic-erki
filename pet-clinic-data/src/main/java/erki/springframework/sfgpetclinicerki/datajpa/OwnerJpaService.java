package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.Owner;
import erki.springframework.sfgpetclinicerki.repositories.OwnerRepository;
import erki.springframework.sfgpetclinicerki.services.OwnerService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Owner save(Owner obj) {
        return ownerRepository.save(obj);
    }

    @Override
    public void delete(Owner obj) {
        ownerRepository.delete(obj);
    }
}

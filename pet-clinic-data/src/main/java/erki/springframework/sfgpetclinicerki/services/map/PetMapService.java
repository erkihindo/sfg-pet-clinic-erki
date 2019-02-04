package erki.springframework.sfgpetclinicerki.services.map;

import erki.springframework.sfgpetclinicerki.model.Pet;
import erki.springframework.sfgpetclinicerki.services.CrudService;
import erki.springframework.sfgpetclinicerki.services.PetService;
import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);

    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

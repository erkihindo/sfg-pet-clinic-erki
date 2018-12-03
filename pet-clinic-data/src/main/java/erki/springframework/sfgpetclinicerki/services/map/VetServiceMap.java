package erki.springframework.sfgpetclinicerki.services.map;

import erki.springframework.sfgpetclinicerki.model.Vet;
import erki.springframework.sfgpetclinicerki.services.CrudService;
import erki.springframework.sfgpetclinicerki.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);

    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

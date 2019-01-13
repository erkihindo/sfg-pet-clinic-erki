package erki.springframework.sfgpetclinicerki.services.map;

import erki.springframework.sfgpetclinicerki.model.Visit;
import erki.springframework.sfgpetclinicerki.services.VisitService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit obj) {

        if (obj.getPet() == null || obj.getPet().getOwner() == null || obj.getPet().getId() == null) {
            throw new RuntimeException("Illegal pet when saving visit");
        }

        super.delete(obj);

    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}

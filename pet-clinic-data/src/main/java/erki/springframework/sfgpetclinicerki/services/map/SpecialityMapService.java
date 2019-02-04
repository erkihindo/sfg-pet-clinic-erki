package erki.springframework.sfgpetclinicerki.services.map;

import erki.springframework.sfgpetclinicerki.model.Speciality;
import erki.springframework.sfgpetclinicerki.services.SpecialityService;
import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality obj) {
        super.delete(obj);

    }

    @Override
    public Speciality save(Speciality obj) {
        return super.save(obj);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}

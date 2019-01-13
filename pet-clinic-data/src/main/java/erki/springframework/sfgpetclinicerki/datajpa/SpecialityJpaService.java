package erki.springframework.sfgpetclinicerki.datajpa;

import erki.springframework.sfgpetclinicerki.model.Speciality;
import erki.springframework.sfgpetclinicerki.repositories.SpecialityRepository;
import erki.springframework.sfgpetclinicerki.services.SpecialityService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class SpecialityJpaService implements SpecialityService {

    private final SpecialityRepository SpecialityRepository;

    public SpecialityJpaService(SpecialityRepository SpecialityRepository) {
        this.SpecialityRepository = SpecialityRepository;
    }


    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> Specialitys = new HashSet<>();

        SpecialityRepository.findAll().forEach(Specialitys::add);
        return Specialitys;
    }

    @Override
    public Speciality findById(Long id) {
        return SpecialityRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Speciality save(Speciality obj) {
        return SpecialityRepository.save(obj);
    }

    @Override
    public void delete(Speciality obj) {
        SpecialityRepository.delete(obj);
    }
}

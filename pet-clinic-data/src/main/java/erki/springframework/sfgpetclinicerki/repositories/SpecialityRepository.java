package erki.springframework.sfgpetclinicerki.repositories;

import erki.springframework.sfgpetclinicerki.model.PetType;
import erki.springframework.sfgpetclinicerki.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}

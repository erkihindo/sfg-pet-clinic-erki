package erki.springframework.sfgpetclinicerki.repositories;

import erki.springframework.sfgpetclinicerki.model.Pet;
import erki.springframework.sfgpetclinicerki.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}

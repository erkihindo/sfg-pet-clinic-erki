package erki.springframework.sfgpetclinicerki.repositories;

import erki.springframework.sfgpetclinicerki.model.Owner;
import erki.springframework.sfgpetclinicerki.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}

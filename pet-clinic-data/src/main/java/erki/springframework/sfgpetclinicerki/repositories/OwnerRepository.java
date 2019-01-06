package erki.springframework.sfgpetclinicerki.repositories;

import erki.springframework.sfgpetclinicerki.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}

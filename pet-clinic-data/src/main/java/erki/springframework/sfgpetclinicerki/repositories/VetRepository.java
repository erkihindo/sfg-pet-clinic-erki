package erki.springframework.sfgpetclinicerki.repositories;

import erki.springframework.sfgpetclinicerki.model.Speciality;
import erki.springframework.sfgpetclinicerki.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {

}

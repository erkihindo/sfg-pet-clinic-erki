package erki.springframework.sfgpetclinicerki.services.map;

import static org.junit.jupiter.api.Assertions.*;

import erki.springframework.sfgpetclinicerki.model.Owner;
import erki.springframework.sfgpetclinicerki.services.PetTypeService;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    PetTypeService petTypeService;

    private final Long OWNER_ID = 1L;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        ownerMapService.save(Owner.builder().id(OWNER_ID).build());
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();

        assertEquals(owners.size(), 1L);
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(1L));

        assertEquals(ownerMapService.findAll().size(), 0L);
    }

    @Test
    void save() {
        Owner owner2 = Owner.builder().id(2L).build();

        Owner savedOwner = ownerMapService.save(owner2);

        assertEquals(2L, savedOwner.getId().longValue());
    }

    @Test
    void findById() {

        Owner owner = ownerMapService.findById(OWNER_ID);

        assertEquals(OWNER_ID, owner.getId());
    }
}

package erki.springframework.sfgpetclinicerki.datajpa;

import static java.util.Collections.singleton;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import erki.springframework.sfgpetclinicerki.model.Owner;
import erki.springframework.sfgpetclinicerki.repositories.OwnerRepository;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerJpaService ownerJpaService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        Owner firstOwner = Owner.builder().id(1L).firstName("Me").build();

        when(ownerRepository.findAll()).thenReturn(singleton(firstOwner));

        Set<Owner> result = ownerJpaService.findAll();

        assertEquals(result.size(), 1L);
    }

    @Test
    void findById() {
        assertThrows(RuntimeException.class, () -> ownerJpaService.findById(666L));
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }
}

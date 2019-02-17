package erki.springframework.sfgpetclinicerki.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import erki.springframework.sfgpetclinicerki.model.Owner;
import erki.springframework.sfgpetclinicerki.services.OwnerService;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @InjectMocks
    OwnerController ownerController;

    @Mock
    OwnerService ownerService;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        owners = new HashSet<Owner>() {{
            add(Owner.builder().id(1L).build());
            add(Owner.builder().id(2L).build());
        }};

        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void list() throws Exception {
        Mockito.when(ownerService.findAll()).thenReturn(owners);

        mockMvc.perform(get("/owners"))
            .andExpect(status().isOk())
            .andExpect(view().name("owner/owners"))
            .andExpect(model().attribute("owners", hasSize(2)));
    }

    @Test
    void find() {
    }
}

package by.vasilenka.psychologist_appointment.service.impl;

import by.vasilenka.psychologist_appointment.entities.PsychologistAppointment;
import by.vasilenka.psychologist_appointment.repositories.PsychologistAppointmentRepository;
import by.vasilenka.psychologist_appointment.services.impl.ClientServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientServiceTest {

    private final static String ACTUAL_CLIENT_FILE = "src/test/resources/services.data/client.json";

    @InjectMocks
    private ClientServiceImpl clientService;

    @Mock
    private PsychologistAppointmentRepository psychologistAppointmentRepository;

    @Test
    public void countOfAllClientsEquals4Test(){
        when(psychologistAppointmentRepository.count()).thenReturn(4L);

        assertEquals(4, clientService.getCountOfAllClients());

    }

    @Test
    public void getAllClients1ClientsTest() throws IOException { // check JSON file
        PsychologistAppointment expected =
                new PsychologistAppointment(1, "Heorhi", "Vasilenka", 20, "Male",
                        "Can't sleep because of problem", "As soon as possible");

        when(psychologistAppointmentRepository.findAll()).thenReturn(List.of(expected));

        Assertions.assertTrue(assertionEqualsToFile(expected, ACTUAL_CLIENT_FILE)); // JSON-file

    }

    private boolean assertionEqualsToFile(PsychologistAppointment psychologistAppointment,
                                          final String fileName) throws IOException {
        return psychologistAppointment.equals(readFromFile(fileName));
    }

    private PsychologistAppointment readFromFile(final String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(Paths.get(fileName).toFile(), PsychologistAppointment.class);
    }

    @ParameterizedTest
    @MethodSource("provideDataClientToUpdateTest")
    void updateClientPositiveTest( PsychologistAppointment psychologistAppointmentExpected){
        Optional<PsychologistAppointment> clientToUpdate = Optional.of(new PsychologistAppointment());

        when(psychologistAppointmentRepository.findById(any())).thenReturn(clientToUpdate);

        PsychologistAppointment response = clientService.updateClient(psychologistAppointmentExpected, 1);
        assertAll("response",
                () -> assertEquals(psychologistAppointmentExpected.getName(), response.getName()),
                () -> assertEquals(psychologistAppointmentExpected.getAge(), response.getAge()),
                () -> assertEquals(psychologistAppointmentExpected.getSex(), response.getSex()),
                () -> assertEquals(psychologistAppointmentExpected.getProblem(), response.getProblem()),
                () -> assertEquals(psychologistAppointmentExpected.getStatus(), response.getStatus())
                );
    }
      private static PsychologistAppointment createPsychologistAppointment(){
       return new PsychologistAppointment(2, "Veronika", "Shamak", 20, "Female",
               "Scared drunk people", "passed");
    }
    static Stream<Arguments> provideDataClientToUpdateTest(){
        return Stream.of(
                Arguments.of(createPsychologistAppointment())
        );
    }

}



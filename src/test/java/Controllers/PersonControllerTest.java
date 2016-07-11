package Controllers;

import bb.DTO.PersonDTO;
import bb.repository.PersonRepository;
import bb.rest.Application;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.jayway.restassured.RestAssured.when;

/**
 * Created by bartosz on 11.07.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class PersonControllerTest {

    @Autowired(required = false)
    private PersonRepository personRepository;

    private PersonDTO personDTO;

    private String JSonToSend;

    @Before
    public void setUp() throws JsonProcessingException {

        personDTO=new PersonDTO();
        personDTO.setId(1);
        personDTO.setName("Bartek");
        personDTO.setAdress("Poznan");
        personDTO.setTel("45763476");
        personDTO.setLogin("BB");
        personDTO.setPassword("BB");

        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        JSonToSend = objectWriter.writeValueAsString(personDTO);

    }

    @Test
    public void helloShouldReportStatusOK() {
        when()
                .get("/hello")
                .then()
                .statusCode(200);
    }


}

package by.vasilenka.visit_psychologist.exceptions;

 /**
 * This exception will be thrown if the program
 * does not find a client with the specified id
 * */

public class PsychologistAppointmentNotFoundException extends RuntimeException {

    public PsychologistAppointmentNotFoundException(String massage) {
        super(massage);

    }

}
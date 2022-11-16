package one.digitalinnovation.cloudparking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
//com RuntimeException, não precisa tratar, não precisa fazer Try e Catch
public class ParkingNotFoundException extends RuntimeException {
    public ParkingNotFoundException(String id) {
        super("Parking not found with id: " + id);
    }
}

package backendpets.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice

public class PetErrorAdvice {

    @ResponseBody
    @ExceptionHandler(PetNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map <String, String> exceptionHandler(PetNotFound exceNotFound){
        Map <String, String> errorMap = new HashMap<>();
        errorMap.put("ERROR MESSAGE", exceNotFound.getMessage());
        return errorMap;
    } 
}

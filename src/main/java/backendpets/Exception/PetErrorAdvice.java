package backendpets.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice

public class PetErrorAdvice {

    @ResponseBody
    @ExceptionHandler(PetNotFound.class)
    public Map <String, String> exceptionHandler(PetNotFound exceNotFound){
        Map <String, String> errorMap = new HashMap<>();
        errorMap.put("ERROR MESSAGE", exceNotFound.getMessage());
        return errorMap;
    } 
}

package com.vcoelho.servicosmobile.exception;

/**
 *
 * @author vinicius
 */
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InformationNotFoundException extends Exception {

    public InformationNotFoundException(Long id) {
        super("Information not found:" + id);
    }
}

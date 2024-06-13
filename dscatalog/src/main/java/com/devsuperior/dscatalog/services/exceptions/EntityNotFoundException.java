package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundException extends  RuntimeException{
private static final long serialVersioUID = 1L;
    public EntityNotFoundException(String msg){
        super(msg);
    }
}

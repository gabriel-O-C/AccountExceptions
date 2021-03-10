package model.entities.exceptions;

public class DomainExceptionA extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainExceptionA (String msg){
        super(msg);
    }

}

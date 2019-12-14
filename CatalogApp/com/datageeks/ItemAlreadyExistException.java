package com.datageeks;

public class ItemAlreadyExistException extends  Exception {

    public ItemAlreadyExistException()
    {

    }
    public  ItemAlreadyExistException(String msg)
    {
        super(msg);
    }
}

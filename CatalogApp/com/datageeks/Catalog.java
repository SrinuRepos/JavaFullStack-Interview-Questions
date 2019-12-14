package com.datageeks;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Catalog {

    private Set<Item> itemsSet = new HashSet<Item>();

    public void add(Item item) throws  ItemAlreadyExistException
    {
        if(itemsSet.contains(item))
        {
            throw new ItemAlreadyExistException(" Item is already exists !!!");
        }
        itemsSet.add(item);
    }

    public Item search(Integer id) throws  ItemNotFoundException
    {
        Item i ;
        try {
             i = itemsSet.stream().filter(item -> item.getId() == id).map(item -> item).findFirst().get();
        }catch (NoSuchElementException exp) {
            throw new ItemNotFoundException(" Item not available with id " + id);
        }
     return i;
    }

    public Item search(String name) throws  ItemNotFoundException
    {
        Item i =  itemsSet.stream().filter(item -> item.getName().equals(name)).map(item -> item).findFirst().get();
        if( i == null)
            throw new ItemNotFoundException(" Item not available with name "+name);
        return i;
    }

    public Item search(Float price) throws  ItemNotFoundException
    {
        Item i =  itemsSet.stream().filter(item -> item.getPrice().equals(price)).map(item -> item).findFirst().get();
        if( i == null)
            throw new ItemNotFoundException(" Item not available with price "+price);
        return i;
    }

    public void delete(Item item) throws  ItemNotFoundException
    {
        if(itemsSet.contains(item))
        {
            itemsSet.remove(item);
        }
      else
        {
            throw new ItemNotFoundException(" Item not available ");
        }
    }

    public void display()
    {
        itemsSet.forEach(item -> System.out.println(item));
    }

}

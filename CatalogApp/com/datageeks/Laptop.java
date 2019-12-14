package com.datageeks;

public class Laptop extends  Item {

    private String model ;
    private Integer memory ;
    private Integer noOfCpus;

    public Laptop() {
    }

    public Laptop(Integer id, String name, Float price, String model, Integer memory, Integer noOfCpus) {
        super(id, name, price);
        this.model = model;
        this.memory = memory;
        this.noOfCpus = noOfCpus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getNoOfCpus() {
        return noOfCpus;
    }

    public void setNoOfCpus(Integer noOfCpus) {
        this.noOfCpus = noOfCpus;
    }

    @Override
    public  int hashCode()
    {
        return this.getId();
    }

    @Override
    public boolean equals(Object obj)
    {
        Laptop l = (Laptop) obj;
        return this.getId().equals(l.getId())
                &&
                this.getName().equals(l.getName())
                &&
                this.getModel().equals(l.getModel())
                &&
                this.getNoOfCpus().equals(l.getNoOfCpus())
                &&
                this.getMemory().equals(l.getMemory());
    }

    @Override
    public String toString() {
        return super.toString()+"Laptop{" +
                "model='" + model + '\'' +
                ", memory=" + memory +
                ", noOfCpus=" + noOfCpus +
                '}';
    }
}

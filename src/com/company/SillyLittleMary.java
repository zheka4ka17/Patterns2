package com.company;
//Prototype
public class SillyLittleMary {
    public static void main(String[] args) {
        Girl mariam = new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam = mariam.clone();
        System.out.println(noMariam.toString());
        noMariam.setName("Not Mariam");
        noMariam.setSilly(false);
        noMariam.setLittle(false);
        System.out.println(noMariam.toString());

    }

}
class Girl implements Cloneable{
    @Override
    public Girl clone() {
        try {
            return (Girl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
           throw new RuntimeException();
        }

    }
    private String name;
    private boolean silly;
    private boolean little;
    private boolean lazy;
    public String getName() {
        return name;
    }
    public Girl(String name){
        this.name= name;
        silly=true;
        little=true;
        lazy= true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLittle() {
        return little;
    }

    public void setLittle(boolean little) {
        this.little = little;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", little=" + little +
                ", lazy=" + lazy +
                '}';
    }
}


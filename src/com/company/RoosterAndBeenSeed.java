package com.company;
//chain of responspibility , цепочка обязанностей
public class RoosterAndBeenSeed {
    public static void main(String[] args) {
        Hen hen = new Hen();
        Cow cow = new Cow();
        Mower mower= new Mower();
        hen.setNextHelper(cow);
        cow.setNextHelper(mower);

        hen.help();


    }
}
abstract class Helper{
    Helper nextHelper;
    void setNextHelper(Helper helper){
        nextHelper= helper;
    }
    public void help(){
        sendMessage();
        if(nextHelper!=null)
            nextHelper.help();

    }

    abstract void sendMessage();
}

class Hen extends Helper{
    @Override
    void sendMessage() {
        System.out.println("Курица корове - Дай масло");
    }
}
class Cow extends Helper{
    @Override
    void sendMessage() {
        System.out.println("Корова косарям - Дай сено");
    }
}
class Mower extends Helper {
    @Override
    void sendMessage() {
        System.out.println("Косари  печке - Дай калачец");
    }
}

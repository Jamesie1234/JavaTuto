package com.robino;

import inheritance.com.robino.BoxWeight;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("My first program ");

        //DynamicInt class method call
        DynamicInt dInt = new DynamicInt();
        dInt.hypotenus();

        //Casting class method called
        Casting myCast = new Casting();
        myCast.Convertion();


        int var[]=new int[5];
        System.out.println("Var array 1 = " + var[1]);

        System.out.println("--------------Inrement --- Decrement--------- ");
        IncDec incdec = new IncDec();
        incdec.incrementDecrement();


        System.out.println("--------------Logical operator--------- ");
        OperatorClass opClass = new OperatorClass();
        opClass.logicalOperator();
        opClass.bitwiseOperator();
        opClass.conditionOperator();




        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.print("Weight of mybox1 is ");
                System.out.println(mybox1.weight);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.print("Weight of mybox2 is ");
                System.out.println(mybox2.weight);



    }
}

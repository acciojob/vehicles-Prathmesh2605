package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,isManual);

        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){

        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed = this.getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            this.stop();
            this.changeGear(1);
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }
        if(newSpeed>=1 && newSpeed<=50){
           // changeSpeed(newSpeed,getCurrentDirection());
            this.changeGear(1);
        }
        if(newSpeed>=51 && newSpeed<=100){
            //changeSpeed(newSpeed,getCurrentDirection());
            this.changeGear(2);
        }
        if(newSpeed>=101 && newSpeed<=150){
            //changeSpeed(newSpeed,getCurrentDirection());
            this.changeGear(3);
        }
        if(newSpeed>=151 && newSpeed<=200){
            //changeSpeed(newSpeed,getCurrentDirection());
            this.changeGear(4);
        }
        if(newSpeed>=201 && newSpeed<=250){
            //changeSpeed(newSpeed,getCurrentDirection());
            this.changeGear(5);
        }
        if(newSpeed>250){
            //changeSpeed(newSpeed,getCurrentDirection());
           this.changeGear(6);
        }

    }
}

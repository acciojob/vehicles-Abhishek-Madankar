package com.driver;

public class F1 extends Car {
    private int rate;

    public F1(String name, boolean isManual) {
//        this.name = getName();
        super(name, isManual);

        //Use arbitrary values for parameters which are not mentioned
        this.setWheels(4);//wheels = 4;
        this.setDoors(4);//door = 4;
        this.setGears(6);//gears = 6;
        this.setType("Auto");//type = "Auto";
        this.setSeats(4);//seats = 4;
        this.rate = 0;
    }

    public void accelerate(int rate){
        int newSpeed = super.getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
//        newSpeed =

        if(newSpeed<=0) {
            //Stop the car, set gear as 1
            System.out.println("new-Speed: "+newSpeed);
            super.stop();
            super.changeGear(1);
        }
        //for all other cases, change the gear accordingly
        else if (newSpeed>=1 && newSpeed <=50) {
            //changeSpeed(newSpeed,getCurrentDirection());
            System.out.println("new-Speed: "+newSpeed);
            super.changeGear(1);
        }
        else if (newSpeed>=51 && newSpeed <=100) {
            //changeSpeed(newSpeed,getCurrentDirection());
            System.out.println("new-Speed: "+newSpeed);
            super.changeGear(2);
        }
        else if (newSpeed>=101 && newSpeed <=150) {
            //changeSpeed(newSpeed,getCurrentDirection());
            super.changeGear(3);
        }
        else if (newSpeed>=151 && newSpeed <=200) {
            //changeSpeed(newSpeed,getCurrentDirection());
            super.changeGear(4);
        }
        else if (newSpeed>=201 && newSpeed <=250) {
            //changeSpeed(newSpeed,getCurrentDirection());
            super.changeGear(5);
        }
        else{
            super.changeGear(6);
        }
    }

//    private int getCurrentDirection() {
//        super.getCurrentDirection();
//    }
}

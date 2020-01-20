package tax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateTax extends TaxCalculator {

int[] petrol = {0, 10, 25, 105, 125, 145, 165, 205, 515, 830, 1240, 1760, 2070 };
    int[] diesel = {0, 25, 105, 125, 145, 165, 205, 515, 830, 1240, 1760, 2070, 2070 };
int[] arrayToUse;
    public int calculateTax(Vehicle vehicle) {
if(vehicle.getFuelType().equals(FuelType.PETROL)){arrayToUse = petrol;}
else{arrayToUse = diesel;}
            if(vehicle.getCo2Emissions()>255){
                return arrayToUse[12];
                //return 2070;
            }
            if(vehicle.getCo2Emissions()>225)
            {return arrayToUse[11];
                //return 1760;
            }
            if(vehicle.getCo2Emissions()>190){
                return arrayToUse[10];
                //return 1240;
            }
            if(vehicle.getCo2Emissions()>170){
                return arrayToUse[9];
                //return 830;
            }
            if(vehicle.getCo2Emissions()>150){
                return arrayToUse[8];
               // return 515;
            }
            if(vehicle.getCo2Emissions()>130){
                return arrayToUse[7];
                //return 205;
            }
            if(vehicle.getCo2Emissions()>110){
                return arrayToUse[6];
                //return 165;
            }
        if(vehicle.getCo2Emissions()>100){
            return arrayToUse[5];
            // return 145;
        }
        if(vehicle.getCo2Emissions()>90){
            return arrayToUse[4];

            //  return 125;
        }
        if(vehicle.getCo2Emissions()>75){
            return arrayToUse[3];

            //return 105;
        }
        if(vehicle.getCo2Emissions()>50){
            return arrayToUse[2];

            //return 25;
        }
        if(vehicle.getCo2Emissions()>1){
            return arrayToUse[1];

            // return 10;
        }
            return 0;





    }


}
//0	£0
//1 - 50	£10
//51 - 75	£25
//76 - 90	£105
//91 - 100	£125
//101 - 110	£145
//111 - 130	£165
//131 - 150	£205
//151 - 170	£515
//171 - 190	£830
//191 - 225	£1,240
//226 - 255	£1,760
//Over 255	£2,070
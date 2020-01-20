package tax;

import java.time.LocalDate;
import java.util.*;

public class CalculateTax extends TaxCalculator {

int[] petrol = {0, 10, 25, 105, 125, 145, 165, 205, 515, 830, 1240, 1760, 2070 };


    public int calculateTax(Vehicle vehicle) {

            if (vehicle.getCo2Emissions() > 255) {
                return petrol[12];
                //return 2070;
            }
            if (vehicle.getCo2Emissions() > 225) {
                return petrol[11];
                //return 1760;
            }
            if (vehicle.getCo2Emissions() > 190) {
                return petrol[10];
                //return 1240;
            }
            if (vehicle.getCo2Emissions() > 170) {
                return petrol[9];
                //return 830;
            }
            if (vehicle.getCo2Emissions() > 150) {
                return petrol[8];
                // return 515;
            }
            if (vehicle.getCo2Emissions() > 130) {
                return petrol[7];
                //return 205;
            }
            if (vehicle.getCo2Emissions() > 110) {
                return petrol[6];
                //return 165;
            }
            if (vehicle.getCo2Emissions() > 100) {
                return petrol[5];
                // return 145;
            }
            if (vehicle.getCo2Emissions() > 90) {
                return petrol[4];

                //  return 125;
            }
            if (vehicle.getCo2Emissions() > 75) {
                return petrol[3];

                //return 105;
            }
            if (vehicle.getCo2Emissions() > 50) {
                return petrol[2];

                //return 25;
            }
            if (vehicle.getCo2Emissions() > 1) {
                return petrol[1];

                // return 10;
            }

return 0;

    }


}

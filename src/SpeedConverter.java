public class SpeedConverter {
    //write code here
    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay >= 8 && hourOfDay <= 22) {
            return false;
        } else if (hourOfDay >= 1 && hourOfDay <= 7) {
            return true;
        }
        return false;
    }

//comeback to this

//        if(hourOfDay < 0 || > 23){
//            return false;
//        }else if (hourOfDay < 8 && hourOfDay > 22) {
//            return true;
//        }
//    }

}
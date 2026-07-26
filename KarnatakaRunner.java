class KarnatakaRunner {

    public static void main(String[] pincode) {

        int[] pinCodes = Karnataka.getPinCodesByCity("bengaluru");

        if(pinCodes != null){

            System.out.println("Pin Codes are:");

            for(int pin : pinCodes){
                System.out.println(pin);
            }

        }else{
            System.out.println("City not found");
        }
    }
}
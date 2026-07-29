class BankRunner {

    public static void main(String[] amulya) {

        String axisBankBranches[] = { "HSR", "ADUGODI", "AECS LAYOUT", "AGARA RING ROAD","AKSHAY NAGAR"};

        String axisBankIfscCodes[] = { "UTIB0004823", "UTIB0005008", "UTIB0003362", "UTIB0004405", "UTIB0004226"};

        Bank bank = new Bank();

        bank.bankId = 1;
        bank.bankName = "Axis Bank";
        bank.branches = axisBankBranches;
        bank.ifscCodes = axisBankIfscCodes;
        bank.location = "Bangalore";
        bank.address = "No. 9, M.G. Road, Bangalore - 560001";

        System.out.println("Bank ID : " + bank.bankId);
        System.out.println("Bank Name : " + bank.bankName);
        System.out.println("Location : " + bank.location);
        System.out.println("Address : " + bank.address);

        for (String branch : bank.branches) {
            System.out.println("Branch : " + branch);
        }

        for (String ifsc : bank.ifscCodes) {
            System.out.println("IFSC Code : " + ifsc);
        }

        String sbiBankBranches[] = { "HSR", "ADUGODI", "AECS LAYOUT", "AKSHAY NAGAR", "Bellandur"};

        String sbiBankIfscCodes[] = { "SBIN0004409", "SBIN0040011", "SBIN0040433", "SBIN0061014", "SBIN0041171" };

        Bank bank1 = new Bank();

        bank1.bankId = 2;
        bank1.bankName = "SBI Bank";
        bank1.branches = sbiBankBranches;
        bank1.ifscCodes = sbiBankIfscCodes;
        bank1.location = "Bangalore";
        bank1.address = "Bangalore";

        System.out.println("Bank ID : " + bank1.bankId);
        System.out.println("Bank Name : " + bank1.bankName);
        System.out.println("Location : " + bank1.location);
        System.out.println("Address : " + bank1.address);

        for (String branch : bank1.branches) {
            System.out.println("Branch : " + branch);
        }

        for (String ifsc : bank1.ifscCodes) {
            System.out.println("IFSC Code : " + ifsc);
        }

        String canaraBankBranches[] = {"HSR Layout","Jayanagar","Koramangala","Indiranagar","Whitefield"};

        String canaraBankIfscCodes[] = {"CNRB0000420","CNRB0000419","CNRB0001123","CNRB0000418","CNRB0002986"};

        Bank bank2 = new Bank();

        bank2.bankId = 3;
        bank2.bankName = "Canara Bank";
        bank2.branches = canaraBankBranches;
        bank2.ifscCodes = canaraBankIfscCodes;
        bank2.location = "Bangalore";
        bank2.address = "Bangalore";

        System.out.println("Bank ID : " + bank2.bankId);
        System.out.println("Bank Name : " + bank2.bankName);
        System.out.println("Location : " + bank2.location);
        System.out.println("Address : " + bank2.address);

        for (String branch : bank2.branches) {
            System.out.println("Branch : " + branch);
        }

        for (String ifsc : bank2.ifscCodes) {
            System.out.println("IFSC Code : " + ifsc);
        }
    }
}
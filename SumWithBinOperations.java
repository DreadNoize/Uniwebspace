class SumWithBinOperations{

    public static void main(String[] args) {
        int natNumA = Integer.parseInt(args[0]);
        int natNumB = Integer.parseInt(args[1]);

        System.out.println(sumBinarys(natNumA, natNumB));
    }

    public static int sumBinarys(int tempNumA, int tempNumB){
        int result = 0;
        int expo = 0;
        int carry = 0;

        while (tempNumA != 0 || tempNumB != 0) {
            result += (((tempNumA % 2) ^ (tempNumB % 2)) ^ carry) << expo;

            carry = ((tempNumA % 2 | tempNumB % 2) & (tempNumA % 2 | carry) & (tempNumB % 2 | carry));

            expo++;
            tempNumA = tempNumA >> 1;
            tempNumB = tempNumB >> 1;
        }

        result += carry << expo;
        return result;
    }
}

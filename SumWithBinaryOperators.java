class SumWithBinaryOperators{

    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println(sumIt(firstNumber, secondNumber));
    }
        public static int sumIt(int kompott1, int kompott2){
            while (kompott2!=0) {
                int carrykompott = (kompott1 & kompott2);
                    kompott1 = kompott1 ^ kompott2;
                    kompott2 = carrykompott << 1;
            }
            return kompott1;
        }
        
    
}

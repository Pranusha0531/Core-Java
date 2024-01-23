public class StaticConcept {
        private static int staticVariable = 5;

        public static int doubleStaticVariable() {
            return staticVariable * 2;
        }

        public static void main(String[] args) {

            System.out.println("Static Variable: " + staticVariable);

            int result = doubleStaticVariable();
            System.out.println("Result of doubling static variable: " + result);
        }
    }

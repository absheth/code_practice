
class StringPermutation {
    public static void main (String args[]) {
        String x = "Akash";

        System.out.println("-----------------------------");
        permutation(x);
    }

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("Permutation: " + prefix);
            System.out.println("*****************************");
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                System.out.println("Rem: " + rem);
                System.out.println("prefix + charAt: " + prefix + str.charAt(i));
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}

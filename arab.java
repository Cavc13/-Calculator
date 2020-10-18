public class arab {

    public static int ArabicCalc(String arab1, String arab2, char simvol) {
        int n1 = Integer.parseInt(String.valueOf(arab1));
        int n2 = Integer.parseInt(String.valueOf(arab2));
        int res = 0;

        if (n1>=0 & n1<=10 & n2>=0 & n2<=10) {

            switch (simvol) {
                case '+':
                    res = n1 + n2;
                    break;
                case '-':
                    res = n1 - n2;
                    break;
                case '*':
                    res = n1 * n2;
                    break;
                case '/':
                    res = n1 / n2;
                    break;

                default:
                    res = -1313;
            }
            return res;
        }

        else return res = -1313;
    }
}


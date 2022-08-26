public class Gen {
    public Gen() {
    }

    public static void main(String[] args) {
        int x = 25; // Указать требуемое количество SSCC

        for(int i = 0; i < x; ++i) {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException var14) {
            }

            String numberExtension = "2";
            String companyGS1 = "460606800";
            String currentTime = String.valueOf(System.currentTimeMillis());
            String linkNumber = currentTime.substring(currentTime.length() - 7);
            String sscc = numberExtension + companyGS1 + linkNumber;
            int sumOdd = 0;
            int sumEven = 0;

            int sum;
            int current;
            for(sum = sscc.length() - 1; sum >= 0; sumOdd += current) {
                current = Integer.parseInt(sscc.substring(sum, sum + 1));
                sum -= 2;
            }

            for(sum = sscc.length() - 2; sum >= 0; sumEven += current) {
                current = Integer.parseInt(sscc.substring(sum, sum + 1));
                sum -= 2;
            }

            sum = sumEven + 3 * sumOdd;
            String contrplNumber = "";
            String substring = String.valueOf(sum).substring(String.valueOf(sum).length() - 1);
            if (substring.equals("0")) {
                contrplNumber = "0";
            } else {
                contrplNumber = String.valueOf(10 - Integer.parseInt(substring));
            }

            System.out.println(sscc + contrplNumber);
        }

    }
}
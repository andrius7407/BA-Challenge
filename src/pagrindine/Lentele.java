package pagrindine;

public class Lentele {
        private String paymentNumber;
        private String  date;
        private String amount;
        private String principalPayment;
        private String interestPayment;
        private String totalPayment;
        private String interestRate;

        public Lentele(String paymentNumber, String date, String amount, String principalPayment,
                       String interestPayment, String totalPayment, String interestRate) {
            this.paymentNumber = paymentNumber;
            this.date = date;
            this.amount = amount;
            this.principalPayment = principalPayment;
            this.interestPayment = interestPayment;
            this.totalPayment = totalPayment;
            this.interestRate = interestRate;
        }

        @Override
        public String toString(){
            return paymentNumber+";"+date+";"+amount+";"+principalPayment+";"+
                    interestPayment+";"+totalPayment+";"+interestRate;
        }

}

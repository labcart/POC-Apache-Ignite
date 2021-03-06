package io.github.devbhuwan.phase1.app.domain;

import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/07
 */
@Getter
public class Payment implements Serializable {

    private Long id;
    private BigDecimal amount;
    private String purpose;
    private Date creationDate;
    private String status;

    public static PaymentBuilder builder() {
        return new PaymentBuilder();
    }

    public static class PaymentBuilder {
        private Payment payment = new Payment();

        public Payment build() {
            return payment;
        }

        public PaymentBuilder id(Long id) {
            payment.id = id;
            return this;
        }


        public PaymentBuilder amount(BigDecimal amount) {
            payment.amount = amount;
            return this;
        }

        public PaymentBuilder purpose(String purpose) {
            payment.purpose = purpose;
            return this;
        }

        public PaymentBuilder creationDate(Date creationDate) {
            payment.creationDate = creationDate;
            return this;
        }

        public PaymentBuilder status(String status) {
            payment.status = status;
            return this;
        }
    }
}

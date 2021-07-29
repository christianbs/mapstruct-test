package br.com.test.component.paymentsubtype.record;

import br.com.test.component.paymenttype.record.PaymentTypeRecord;

import javax.validation.constraints.NotNull;

public record PaymentSubtypeRecord(Integer id,
                                   @NotNull String name,
                                   String icon,
                                   PaymentTypeRecord paymentType) {

}

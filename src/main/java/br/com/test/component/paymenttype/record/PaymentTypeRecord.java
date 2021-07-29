package br.com.test.component.paymenttype.record;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public record PaymentTypeRecord(@Positive @NotNull Integer id, @NotNull String name) {

}

package br.com.test.component.paymentsubtype.record;

import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
public record CreatePaymentSubtypeRecord(
        @NotNull String name,
        String icon,
        Integer paymentTypeId
) {

}

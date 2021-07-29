package br.com.test.component.paymentsubtype.mapper;

import br.com.test.component.paymentsubtype.PaymentSubtype;
import br.com.test.component.paymentsubtype.record.PaymentSubtypeRecord;
import br.com.test.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface PaymentSubtypeToPaymentSubtypeRecord extends Converter<PaymentSubtype, PaymentSubtypeRecord> {

    @Override
    @Mapping(source = "paymentType", target = "paymentType")
    PaymentSubtypeRecord convert(final PaymentSubtype paymentSubtype);

}

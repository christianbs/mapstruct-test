package br.com.test.component.paymentsubtype.mapper;

import br.com.test.component.paymentsubtype.PaymentSubtype;
import br.com.test.component.paymentsubtype.record.CreatePaymentSubtypeRecord;
import br.com.test.component.paymenttype.PaymentType;
import br.com.test.configuration.MapStructConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MapStructConfiguration.class)
public interface CreatePaymentSubtypeRecordToPaymentSubtype extends Converter<CreatePaymentSubtypeRecord, PaymentSubtype> {

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "paymentTypeId", target = "paymentType")
    PaymentSubtype convert(CreatePaymentSubtypeRecord record);

    @Mapping(target = "name", ignore = true)
    @Mapping(source = "paymentTypeId", target = "id")
    PaymentType paymentTypeIdToPaymentType(Integer paymentTypeId);

}

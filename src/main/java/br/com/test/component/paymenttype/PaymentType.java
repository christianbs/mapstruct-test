package br.com.test.component.paymenttype;

import br.com.test.shared.jpa.AbstractAuditableEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentType extends AbstractAuditableEntity {

    private int id;

    private String name;

    void update(final String name) {
        if (StringUtils.isNotBlank(name) && !name.equals(this.name)) {
            this.name = name;
        }
    }

}

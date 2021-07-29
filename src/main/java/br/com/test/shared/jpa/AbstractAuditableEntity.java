package br.com.test.shared.jpa;

import java.time.Instant;

public class AbstractAuditableEntity {

    private Instant createDate;

    private Instant lastUpdateDate;

    void audit() {
        if (createDate == null) {
            createDate = Instant.now();
        }
        lastUpdateDate = Instant.now();
    }

}

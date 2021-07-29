package br.com.test.shared.jpa;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.Instant;

@MappedSuperclass
public class AbstractAuditableEntity {

    @Column(name = "create_date", nullable = false)
    private Instant createDate;

    @Column(name = "last_update_date", nullable = false)
    private Instant lastUpdateDate;

    @PrePersist
    void audit() {
        if (createDate == null) {
            createDate = Instant.now();
        }
        lastUpdateDate = Instant.now();
    }

}

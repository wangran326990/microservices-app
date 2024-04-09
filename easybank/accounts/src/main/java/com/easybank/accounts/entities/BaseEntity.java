package com.easybank.accounts.entities;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    @Column(updatable = false)

    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updateAt;
    @Column(insertable = false)
    private String updateBy;
}

package com.easybank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of InnocentUdo's Bank",
            example = "2346578564"
    )
    @NotEmpty(message="Account number cannot be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;
    @Schema(
            description = "Account Type of InnocentUdo's Bank",
            example = "Savings"
    )
    @NotEmpty(message="Account type cannot be a null or empty")
    private String accountType;

    @Schema(
            description = "InnocentUdo's Branch address",
            example = "Lekki Phase 1, Lagos Nigeria"
    )
    @NotEmpty(message="Branch address cannot be a null or empty")
    private String branchAddress;
}

package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;
}

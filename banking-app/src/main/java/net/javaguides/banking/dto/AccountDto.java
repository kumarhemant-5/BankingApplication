package net.javaguides.banking.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//@AllArgsConstructor
public class AccountDto {
    private long id;
    private String accountHolderName;
    private double balance;

}

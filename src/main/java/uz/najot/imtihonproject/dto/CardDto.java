package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CardDto {
    private int id;
    private double balance;
    private String card_number;
    private String phone;
}

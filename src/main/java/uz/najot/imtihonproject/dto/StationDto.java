package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StationDto {
    private int id;
    private String name;
    private double balance;
}

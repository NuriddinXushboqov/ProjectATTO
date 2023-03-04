package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.najot.imtihonproject.entity.Station;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TerminalDto2 {
    private int id;
    private String name;
    private Station station;
}

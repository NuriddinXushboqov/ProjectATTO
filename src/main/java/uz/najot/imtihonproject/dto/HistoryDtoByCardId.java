package uz.najot.imtihonproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HistoryDtoByCardId {
//    private Integer id;
    private Integer card_id;
    private String station_name;
    private Double balance;
    private Date created_date;

}

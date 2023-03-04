package uz.najot.imtihonproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Card extends BaseEntity {

    private double balance;
    private String phone;
    private String card_number;


}

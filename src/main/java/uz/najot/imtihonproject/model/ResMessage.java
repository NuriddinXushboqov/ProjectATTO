package uz.najot.imtihonproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResMessage {
    private Integer code;
    private String message;
    private Object data;

    public static ResMessage getSuccess(int i, String success) {
        return new ResMessage(i,success,null);
    }
    public static ResMessage getSuccess(Object data) {
        return new ResMessage(0,"success",data);
    }
}

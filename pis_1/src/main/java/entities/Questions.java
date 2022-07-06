package entities;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Questions {
    private Integer id;
    private Integer pack_num;
    private String question;
    private String type;
}
package entities.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class AnswersDTO {
    private Integer question_id ;
    private String type;
    private String answer;
}
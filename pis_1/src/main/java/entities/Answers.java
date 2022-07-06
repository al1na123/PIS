package entities;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Answers {
    private Integer id;
    private Questions question;
    private String type;
    private String answer;
}
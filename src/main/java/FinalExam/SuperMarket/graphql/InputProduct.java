package FinalExam.SuperMarket.graphql;

import lombok.Data;

@Data
public class InputProduct {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
}

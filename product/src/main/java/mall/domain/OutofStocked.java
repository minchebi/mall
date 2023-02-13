package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OutofStocked extends AbstractEvent {

    private Long id;

    public OutofStocked(Inventory aggregate){
        super(aggregate);
    }
    public OutofStocked(){
        super();
    }
}

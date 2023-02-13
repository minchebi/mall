package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeleveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private Integer productName;
    private Integer status;

    public DeleveryReturned(Delivery aggregate){
        super(aggregate);
    }
    public DeleveryReturned(){
        super();
    }
}

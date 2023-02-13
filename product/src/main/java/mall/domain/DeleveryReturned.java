package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeleveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private Integer productName;
    private Integer status;
}



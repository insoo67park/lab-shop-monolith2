package labshopmonolith.domain;

import java.util.*;
import labshopmonolith.domain.*;
import labshopmonolith.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class Test extends AbstractEvent {

    private Long id;

    public Test() {
        super();
    }
    // keep

}

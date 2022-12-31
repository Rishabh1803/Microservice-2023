package com.rk.orderservice.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}

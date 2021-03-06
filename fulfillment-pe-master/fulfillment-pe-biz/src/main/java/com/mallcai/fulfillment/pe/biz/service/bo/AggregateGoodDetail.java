package com.mallcai.fulfillment.pe.biz.service.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AggregateGoodDetail {
    private Integer store;
    private Integer productNum ;
    private Integer cityId;
    private Integer cityProductId;
}

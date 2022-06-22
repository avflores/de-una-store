package com.pichincha.deuna.v1.model;

import com.pichincha.deuna.model.dto.ProductDto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductResponseDto implements Serializable {

    private List<ProductDto> prods;

}

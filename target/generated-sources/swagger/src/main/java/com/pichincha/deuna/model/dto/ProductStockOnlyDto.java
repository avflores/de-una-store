package com.pichincha.deuna.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * ProductStockOnlyDto
 */
@Validated
@JacksonXmlRootElement(localName = "ProductStockOnlyDto")
@XmlRootElement(name = "ProductStockOnlyDto")
@XmlAccessorType(XmlAccessType.FIELD)

public class ProductStockOnlyDto   {
  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id = null;

  @JsonProperty("stock")
  @JacksonXmlProperty(localName = "stock")
  private Integer stock = null;

  public ProductStockOnlyDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductStockOnlyDto stock(Integer stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Get stock
   * minimum: 1
   * @return stock
   **/
  @Schema(description = "")
  
  @Min(1)  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductStockOnlyDto productStockOnly = (ProductStockOnlyDto) o;
    return Objects.equals(this.id, productStockOnly.id) &&
        Objects.equals(this.stock, productStockOnly.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStockOnlyDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

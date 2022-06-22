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
 * ItemDto
 */
@Validated
@JacksonXmlRootElement(localName = "ItemDto")
@XmlRootElement(name = "ItemDto")
@XmlAccessorType(XmlAccessType.FIELD)

public class ItemDto   {
  @JsonProperty("idProduct")
  @JacksonXmlProperty(localName = "idProduct")
  private Long idProduct = null;

  @JsonProperty("idStore")
  @JacksonXmlProperty(localName = "idStore")
  private Long idStore = null;

  @JsonProperty("amount")
  @JacksonXmlProperty(localName = "amount")
  private Integer amount = null;

  public ItemDto idProduct(Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Get idProduct
   * @return idProduct
   **/
  @Schema(description = "")
  
    public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public ItemDto idStore(Long idStore) {
    this.idStore = idStore;
    return this;
  }

  /**
   * Get idStore
   * @return idStore
   **/
  @Schema(description = "")
  
    public Long getIdStore() {
    return idStore;
  }

  public void setIdStore(Long idStore) {
    this.idStore = idStore;
  }

  public ItemDto amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDto item = (ItemDto) o;
    return Objects.equals(this.idProduct, item.idProduct) &&
        Objects.equals(this.idStore, item.idStore) &&
        Objects.equals(this.amount, item.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduct, idStore, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDto {\n");
    
    sb.append("    idProduct: ").append(toIndentedString(idProduct)).append("\n");
    sb.append("    idStore: ").append(toIndentedString(idStore)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

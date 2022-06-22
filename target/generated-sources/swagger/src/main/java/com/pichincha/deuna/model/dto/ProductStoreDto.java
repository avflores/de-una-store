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
 * ProductStoreDto
 */
@Validated
@JacksonXmlRootElement(localName = "ProductStoreDto")
@XmlRootElement(name = "ProductStoreDto")
@XmlAccessorType(XmlAccessType.FIELD)

public class ProductStoreDto   {
  @JsonProperty("idProductStore")
  @JacksonXmlProperty(localName = "idProductStore")
  private Long idProductStore = null;

  @JsonProperty("idProduct")
  @JacksonXmlProperty(localName = "idProduct")
  private Long idProduct = null;

  @JsonProperty("idStore")
  @JacksonXmlProperty(localName = "idStore")
  private Long idStore = null;

  public ProductStoreDto idProductStore(Long idProductStore) {
    this.idProductStore = idProductStore;
    return this;
  }

  /**
   * Cod Product Store
   * @return idProductStore
   **/
  @Schema(description = "Cod Product Store")
  
    public Long getIdProductStore() {
    return idProductStore;
  }

  public void setIdProductStore(Long idProductStore) {
    this.idProductStore = idProductStore;
  }

  public ProductStoreDto idProduct(Long idProduct) {
    this.idProduct = idProduct;
    return this;
  }

  /**
   * Id Products
   * @return idProduct
   **/
  @Schema(description = "Id Products")
  
    public Long getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Long idProduct) {
    this.idProduct = idProduct;
  }

  public ProductStoreDto idStore(Long idStore) {
    this.idStore = idStore;
    return this;
  }

  /**
   * Id Store
   * @return idStore
   **/
  @Schema(description = "Id Store")
  
    public Long getIdStore() {
    return idStore;
  }

  public void setIdStore(Long idStore) {
    this.idStore = idStore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductStoreDto productStore = (ProductStoreDto) o;
    return Objects.equals(this.idProductStore, productStore.idProductStore) &&
        Objects.equals(this.idProduct, productStore.idProduct) &&
        Objects.equals(this.idStore, productStore.idStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProductStore, idProduct, idStore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductStoreDto {\n");
    
    sb.append("    idProductStore: ").append(toIndentedString(idProductStore)).append("\n");
    sb.append("    idProduct: ").append(toIndentedString(idProduct)).append("\n");
    sb.append("    idStore: ").append(toIndentedString(idStore)).append("\n");
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

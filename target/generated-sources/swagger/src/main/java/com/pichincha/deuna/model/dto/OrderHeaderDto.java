package com.pichincha.deuna.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.xml.bind.annotation.*;

/**
 * OrderHeaderDto
 */
@Validated
@JacksonXmlRootElement(localName = "OrderHeaderDto")
@XmlRootElement(name = "OrderHeaderDto")
@XmlAccessorType(XmlAccessType.FIELD)

public class OrderHeaderDto   {
  @JsonProperty("idOrderHeader")
  @JacksonXmlProperty(localName = "idOrderHeader")
  private Integer idOrderHeader = null;

  @JsonProperty("idClient")
  @JacksonXmlProperty(localName = "idClient")
  private Integer idClient = null;

  @JsonProperty("dateOrder")
  @JacksonXmlProperty(localName = "dateOrder")
  private LocalDate dateOrder = null;

  @JsonProperty("total")
  @JacksonXmlProperty(localName = "total")
  private Long total = null;

  public OrderHeaderDto idOrderHeader(Integer idOrderHeader) {
    this.idOrderHeader = idOrderHeader;
    return this;
  }

  /**
   * Get idOrderHeader
   * @return idOrderHeader
   **/
  @Schema(description = "")
  
    public Integer getIdOrderHeader() {
    return idOrderHeader;
  }

  public void setIdOrderHeader(Integer idOrderHeader) {
    this.idOrderHeader = idOrderHeader;
  }

  public OrderHeaderDto idClient(Integer idClient) {
    this.idClient = idClient;
    return this;
  }

  /**
   * Get idClient
   * @return idClient
   **/
  @Schema(description = "")
  
    public Integer getIdClient() {
    return idClient;
  }

  public void setIdClient(Integer idClient) {
    this.idClient = idClient;
  }

  public OrderHeaderDto dateOrder(LocalDate dateOrder) {
    this.dateOrder = dateOrder;
    return this;
  }

  /**
   * Get dateOrder
   * @return dateOrder
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getDateOrder() {
    return dateOrder;
  }

  public void setDateOrder(LocalDate dateOrder) {
    this.dateOrder = dateOrder;
  }

  public OrderHeaderDto total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   **/
  @Schema(description = "")
  
    public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderHeaderDto orderHeader = (OrderHeaderDto) o;
    return Objects.equals(this.idOrderHeader, orderHeader.idOrderHeader) &&
        Objects.equals(this.idClient, orderHeader.idClient) &&
        Objects.equals(this.dateOrder, orderHeader.dateOrder) &&
        Objects.equals(this.total, orderHeader.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOrderHeader, idClient, dateOrder, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderHeaderDto {\n");
    
    sb.append("    idOrderHeader: ").append(toIndentedString(idOrderHeader)).append("\n");
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    dateOrder: ").append(toIndentedString(dateOrder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

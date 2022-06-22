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
 * ClientDto
 */
@Validated
@JacksonXmlRootElement(localName = "ClientDto")
@XmlRootElement(name = "ClientDto")
@XmlAccessorType(XmlAccessType.FIELD)

public class ClientDto   {
  @JsonProperty("idClient")
  @JacksonXmlProperty(localName = "idClient")
  private Long idClient = null;

  @JsonProperty("document")
  @JacksonXmlProperty(localName = "document")
  private String document = null;

  @JsonProperty("name")
  @JacksonXmlProperty(localName = "name")
  private String name = null;

  @JsonProperty("lastName")
  @JacksonXmlProperty(localName = "lastName")
  private String lastName = null;

  @JsonProperty("picture")
  @JacksonXmlProperty(localName = "picture")
  private String picture = null;

  public ClientDto idClient(Long idClient) {
    this.idClient = idClient;
    return this;
  }

  /**
   * Get idClient
   * @return idClient
   **/
  @Schema(description = "")
  
    public Long getIdClient() {
    return idClient;
  }

  public void setIdClient(Long idClient) {
    this.idClient = idClient;
  }

  public ClientDto document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
   **/
  @Schema(description = "")
  
    public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public ClientDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(description = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientDto picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * Get picture
   * @return picture
   **/
  @Schema(description = "")
  
    public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDto client = (ClientDto) o;
    return Objects.equals(this.idClient, client.idClient) &&
        Objects.equals(this.document, client.document) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.lastName, client.lastName) &&
        Objects.equals(this.picture, client.picture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idClient, document, name, lastName, picture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDto {\n");
    
    sb.append("    idClient: ").append(toIndentedString(idClient)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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

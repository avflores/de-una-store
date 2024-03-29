/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.pichincha.deuna.controller;

import com.pichincha.deuna.model.dto.ProductDto;
import com.pichincha.deuna.model.dto.ProductListDto;
import com.pichincha.deuna.model.dto.ProductStockOnlyDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductApi {

    Logger log = LoggerFactory.getLogger(ProductApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Finds products given cod", description = "Finds products and return cod and name.", tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ProductDto.class))),
        
        @ApiResponse(responseCode = "204", description = "no content.") })
    @RequestMapping(value = "/products/{idProduct}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ProductDto> _findAByCod(@Parameter(in = ParameterIn.PATH, description = "Id Product", required=true, schema=@Schema()) @PathVariable("idProduct") Long idProduct) {
        return findAByCod(idProduct);
    }

    // Override this method
    default ResponseEntity<ProductDto> findAByCod(Long idProduct) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"price\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"cod\" : \"cod\",\n  \"id\" : 0,\n  \"stock\" : 1\n}", ProductDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Finds all products", description = "Finds all products and return cod and name.", tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ProductListDto.class))) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ProductListDto> _findAll() {
        return findAll();
    }

    // Override this method
    default ResponseEntity<ProductListDto> findAll() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"price\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"cod\" : \"cod\",\n  \"id\" : 0,\n  \"stock\" : 1\n}, {\n  \"price\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"cod\" : \"cod\",\n  \"id\" : 0,\n  \"stock\" : 1\n} ]", ProductListDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Update product stock by idProduct", description = "Update product stock by idProduct", tags={ "product" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ProductDto.class))),
        
        @ApiResponse(responseCode = "204", description = "no content.") })
    @RequestMapping(value = "/products/{idProduct}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    default ResponseEntity<ProductDto> _updateStock(@Parameter(in = ParameterIn.PATH, description = "Id Product", required=true, schema=@Schema()) @PathVariable("idProduct") Long idProduct, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody ProductStockOnlyDto body) {
        return updateStock(idProduct, body);
    }

    // Override this method
    default ResponseEntity<ProductDto> updateStock(Long idProduct,ProductStockOnlyDto body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"price\" : 6.027456183070403,\n  \"name\" : \"name\",\n  \"cod\" : \"cod\",\n  \"id\" : 0,\n  \"stock\" : 1\n}", ProductDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}


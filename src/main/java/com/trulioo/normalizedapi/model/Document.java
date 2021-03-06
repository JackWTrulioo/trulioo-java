/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T15:36:47.107-07:00")
public class Document {
  @SerializedName("DocumentFrontImage")
  private byte[] documentFrontImage = null;

  @SerializedName("DocumentBackImage")
  private byte[] documentBackImage = null;

  @SerializedName("LivePhoto")
  private byte[] livePhoto = null;

  @SerializedName("DocumentType")
  private String documentType = null;

  public Document documentFrontImage(byte[] documentFrontImage) {
    this.documentFrontImage = documentFrontImage;
    return this;
  }

   /**
   * Front of the document
   * @return documentFrontImage
  **/
  @ApiModelProperty(value = "Front of the document")
  public byte[] getDocumentFrontImage() {
    return documentFrontImage;
  }

  public void setDocumentFrontImage(byte[] documentFrontImage) {
    this.documentFrontImage = documentFrontImage;
  }

  public Document documentBackImage(byte[] documentBackImage) {
    this.documentBackImage = documentBackImage;
    return this;
  }

   /**
   * Back of the document
   * @return documentBackImage
  **/
  @ApiModelProperty(value = "Back of the document")
  public byte[] getDocumentBackImage() {
    return documentBackImage;
  }

  public void setDocumentBackImage(byte[] documentBackImage) {
    this.documentBackImage = documentBackImage;
  }

  public Document livePhoto(byte[] livePhoto) {
    this.livePhoto = livePhoto;
    return this;
  }

   /**
   * Selfie image
   * @return livePhoto
  **/
  @ApiModelProperty(value = "Selfie image")
  public byte[] getLivePhoto() {
    return livePhoto;
  }

  public void setLivePhoto(byte[] livePhoto) {
    this.livePhoto = livePhoto;
  }

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Document type
   * @return documentType
  **/
  @ApiModelProperty(value = "Document type")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentFrontImage, document.documentFrontImage) &&
        Objects.equals(this.documentBackImage, document.documentBackImage) &&
        Objects.equals(this.livePhoto, document.livePhoto) &&
        Objects.equals(this.documentType, document.documentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentFrontImage, documentBackImage, livePhoto, documentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentFrontImage: ").append(toIndentedString(documentFrontImage)).append("\n");
    sb.append("    documentBackImage: ").append(toIndentedString(documentBackImage)).append("\n");
    sb.append("    livePhoto: ").append(toIndentedString(livePhoto)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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


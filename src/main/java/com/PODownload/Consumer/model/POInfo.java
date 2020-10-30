package com.PODownload.Consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
//@Table(name = "PO")
public class POInfo {

   @Id
   private long poNumber;
   private String poDate;
   private String poAddress;
   private String poLineNumber;
   private long upcNumber;
   private String upcName;
   private String itemName;
   private int orderedQuantity;
}


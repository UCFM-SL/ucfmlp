/*
* Dr M H B Ariyaratne
 * buddhika.ari@gmail.com
 */
package com.divudi.entity.membership;

import com.divudi.entity.PriceMatrix;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


/**
 *
 * @author buddhika
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PharmacyMemberShipDiscount extends PriceMatrix implements Serializable {
    private static final long serialVersionUID = 1L;
    
}

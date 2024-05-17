package com.example.bfi.domain.entity;

import com.example.bfi.domain.dto.enumeration.TariffDimensionType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * TariffElement
 */
@Data
@EqualsAndHashCode(callSuper = false, of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PriceComponent implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 36)
    @Id
    @Field("id")
    private String id;

    @Field("type")
    private TariffDimensionType tariffDimensionType;

    @Field("price")
    private Double price;

    @Field("vat")
    private Double inclVat;

    @Field("step_size")
    private Integer stepSize;
}

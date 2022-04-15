package ua.borovyk.catalogue.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductImageDto {

    private Long id;

    private byte[] content;

    private String extension;

    private int orderIndex;

}

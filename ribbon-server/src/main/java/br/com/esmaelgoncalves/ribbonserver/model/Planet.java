package br.com.esmaelgoncalves.ribbonserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
    private Long id;
    private String name;
    private String climate;
    private String terrain;
    private Integer films;
}



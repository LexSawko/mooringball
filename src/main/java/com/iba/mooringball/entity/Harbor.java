package com.iba.mooringball.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="harbor")
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Harbor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(notes = "The database generated harbor's ID")
    private Long harborId;

    @Column(name = "latitude", nullable = false)
    @ApiModelProperty(notes = "Harbor's latitude")
    private double latitude;

    @Column(name = "longitude", nullable = false)
    @ApiModelProperty(notes = "Harbor's longitude")
    private double longitude;

    @Column(name = "name", nullable = false)
    @ApiModelProperty(notes = "Harbor's name")
    private String name;

    @OneToMany(mappedBy = "harbor")
    private List<MooringBall> balls;


    public void setHarborId(Long harborId) {
        this.harborId = harborId;
    }
}

package com.insuretrack.domain;

import com.insuretrack.InsuranceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_insurance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "insuranceSeqGen", sequenceName = "insurance_seq", allocationSize = 1)
public class Insurance {
    //Oracle oferece suporte nativo a sequências, o que torna mais eficiente e confiável para geração de IDs
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private InsuranceType insuranceType;

    @Column(nullable = false, precision = 4, scale = 2)
    private Double value;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}

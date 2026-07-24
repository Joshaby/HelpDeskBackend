package com.joshaby.helpdesk.domain;

import com.joshaby.helpdesk.enums.Prioridade;
import com.joshaby.helpdesk.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

@Entity
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private LocalDateTime dataAbertura = LocalDateTime.now();

    private LocalDateTime dataFechamento;

    private Prioridade prioridade;

    private Status status;

    private String titulo;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}

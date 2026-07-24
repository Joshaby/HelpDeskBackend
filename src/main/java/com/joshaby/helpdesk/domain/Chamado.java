package com.joshaby.helpdesk.domain;

import com.joshaby.helpdesk.enums.Prioridade;
import com.joshaby.helpdesk.enums.Status;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Chamado {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacao;
    private Tecnico tecnico;
    private Cliente cliente;
}

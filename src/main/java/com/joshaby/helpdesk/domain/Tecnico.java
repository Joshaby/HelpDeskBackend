package com.joshaby.helpdesk.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tecnico extends Pessoa {

    private List<Chamado> chamados = new ArrayList<>();
}

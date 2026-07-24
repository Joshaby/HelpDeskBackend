package com.joshaby.helpdesk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Cliente extends Pessoa {

    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();
}

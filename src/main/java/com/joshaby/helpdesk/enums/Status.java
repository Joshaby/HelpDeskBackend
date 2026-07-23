package com.joshaby.helpdesk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    final Integer id;
    final String descricao;

    public static Status toEnum(Integer id) {
        return Arrays.stream(Status.values()).filter(perfil -> Objects.equals(perfil.getId(), id))
                .findFirst().orElse(null);
    }
}

package com.joshaby.helpdesk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MÉDIA"),
    ALTA(2, "ALTA");

    final Integer id;
    final String descricao;

    public static Prioridade toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        return Arrays.stream(Prioridade.values()).filter(perfil -> Objects.equals(perfil.getId(), id))
                .findFirst().orElse(null);
    }
}

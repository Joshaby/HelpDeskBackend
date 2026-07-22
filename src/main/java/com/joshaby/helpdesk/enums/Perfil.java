package com.joshaby.helpdesk.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@AllArgsConstructor
@Getter
public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    final Integer id;
    final String descricao;

    public static Perfil toEnum(Integer id) {
        if (id == null) {
            return null;
        }
        return Arrays.stream(Perfil.values()).filter(perfil -> Objects.equals(perfil.getId(), id))
                .findFirst().orElse(null);
    }
}
